import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = s.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = s.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException p){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int um, int dois) throws ParametrosInvalidosException{
        if (um >= dois){
            throw new ParametrosInvalidosException();
        }

        int diferenca = dois - um;
        for (int i = 1; i <= diferenca ; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }

}