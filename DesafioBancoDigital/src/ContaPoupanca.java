public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente); // Explicitly calling the parent (Conta) constructor
    }
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato da Conta Poupanca===");
        super.imprimirInfosComuns();
    }

}
