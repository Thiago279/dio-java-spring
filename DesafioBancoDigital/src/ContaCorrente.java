public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente); // Explicitly calling the parent (Conta) constructor
    }
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato da Conta Corrente===");
        super.imprimirInfosComuns();
    }
}
