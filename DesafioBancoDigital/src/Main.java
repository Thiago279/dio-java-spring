public class Main {

    public static void main(String[] args) {

        Cliente Thiago = new Cliente();
        Thiago.setNome("Thiago");

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.setCliente(Thiago);
        poupanca.setCliente(Thiago);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
