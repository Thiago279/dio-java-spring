public abstract class  Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    private int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Conta(){
        agencia = AGENCIA_PADRAO++;
        numero = SEQUENCIAL++;
    }
    @Override
    public  void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public  void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public  void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public abstract void imprimirExtrato();
    protected void imprimirInfosComuns(){
        System.out.printf("cliente: %s\n",cliente.getNome());
        System.out.printf("agencia: %d\n", agencia);
        System.out.printf("Numero: %d\n", numero);
        System.out.printf("Saldo: %.2f\n", saldo);
    }
}
