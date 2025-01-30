import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia ;
        String nomeCliente ;
        float saldo ;

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextFloat();


        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
