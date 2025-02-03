public class Main {

    public static void main(String[] args) {

        Banco Inter = new Banco();
        Inter.setNome("Inter");


        Cliente Thiago = new Cliente();
        Thiago.setNome("Thiago");

        Inter.adicionarCliente(Thiago);

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.setCliente(Thiago);
        poupanca.setCliente(Thiago);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Inter.listarClientes();;
    }
}
