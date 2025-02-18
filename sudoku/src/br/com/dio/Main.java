package br.com.dio;

import br.com.dio.model.Board;
import br.com.dio.model.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static br.com.dio.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;
    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        var option = -1;
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Iniciar um novo jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Novo jogo iniciado!");
                    startGame(positions);
                    break;
                case 2:
                    System.out.println("Digite o número a ser adicionado:");
                    inputNumber();
                    int numero = scanner.nextInt();
                    System.out.println("Número " + numero + " adicionado!");
                    break;
                case 3:
                    System.out.println("Número removido do jogo!");
                    removeNumber();
                    break;
                case 4:
                    System.out.println("Visualizando jogo atual...");
                    showCurrentGame();
                    break;
                case 5:
                    System.out.println("Verificando status do jogo...");
                    showGameStatus();
                    break;
                case 6:
                    System.out.println("Jogo limpo!");
                    clearGame();
                    break;
                case 7:
                    System.out.println("Jogo finalizado!");
                    finishGame();
                    break;
                case 8:
                    System.out.println("Saindo do jogo...");
                    scanner.close();
                    System.exit(0);
                    return; // Sai do método main e encerra o programa
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void startGame(Map<String, String> positions) {
        if (nonNull(board)){
            System.out.println("O jogo ja foi iniciado!");
            return;
        }
        List<List<Square>> squares = new ArrayList<>();
        for(int i = 0; i< BOARD_LIMIT; i++){
            squares.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++){
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSquare = new Square(fixed,expected);
                squares.get(i).add(currentSquare);

            }
        }
        board = new Board(squares);
        System.out.println("O jogo está pronto para começar");
    }

    private static void inputNumber() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }
        System.out.println("Informe a coluna em que o número será inserido: ");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha em que o número será inserido: ");
        var row = runUntilGetValidNumber(0,8);
        System.out.printf("Informe o número que vai entrar na posicão [%s,%s]",col,row);
        var value = runUntilGetValidNumber(1,9);
        if (!board.changeValue(col,row,value)){
            System.out.printf("A posição[%s,%s] tem um valor fixo\n", col,row);
        }
    }

    private static void removeNumber() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }
        System.out.println("Informe a coluna em que o número será removido: ");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha em que o número será removido: ");
        var row = runUntilGetValidNumber(0,8);
        if (!board.clearValue(col,row)){
            System.out.printf("A posição[%s,%s] tem um valor fixo\n", col,row);
        }
    }

    private static void showCurrentGame() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }

        var args = new Object[81];
        var argPos = 0;
        for( int i = 0 ; i < BOARD_LIMIT; i++){
            for ( var col : board.getSquares()){
                args[argPos++] = " "+ (((isNull(col.get(i).getActual()))) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("Seu jogo se encontra da seguinte forma:");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }
        System.out.printf("O jogo atualmente se encontra no status %s\n", board.getStatus().getLabel());
        if (board.hasErrors()){
            System.out.println("O jogo tem erros");
        }else {
            System.out.println("O jogo não contém erros");
        }

    }

    private static void clearGame() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }
        System.out.println( "Tem certeza que deseja limpar seu jogo e perder todo seu progresso?");
        var confirm = scanner.next();
        while(!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")){
            System.out.println("Informe 'sim' ou 'não'");
            confirm = scanner.next();

        }
        if(confirm.equalsIgnoreCase("sim")){
            board.reset();
        }
    }

    private static void finishGame() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi foi iniciado!");
            return;
        }

        if (board.gameIsFinished()){
            System.out.println("Parabéns, você concluiu o jogo! ");
            showCurrentGame();
            board = null;
        }
        else if (board.hasErrors()){
            System.out.println("Seu jogo contém erros, verifique o tabuleiro e ajuste-o");
        }
        else{
            System.out.println("Você ainda precisa preencher algum espaço");
        }
    }

    private static int runUntilGetValidNumber( final int min, final int max){
        var current = scanner.nextInt();
        while (current < min || current > max){
            System.out.printf("Informe um numero entre %s e %s\n",min , max);
            current = scanner.nextInt();
        }
        return current;
    }

}


