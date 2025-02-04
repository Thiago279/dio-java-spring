import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Double.MIN_VALUE;

public class Banco {
    public String nome;
    public List<Cliente> listaClientes;

    protected List<Conta> listaContas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Banco() {
    }

    public void adicionarConta(Conta conta){
        if(listaContas == null){
            listaContas = new ArrayList<Conta>();
        }
        listaContas.add(conta);
    }
    public void adicionarCliente(Cliente cliente){
        if(listaClientes == null){
            listaClientes = new ArrayList<Cliente>();
        }
        if(!listaClientes.contains(cliente)) {
            listaClientes.add(cliente);
        }
    }


    public void listarClientes(){
        System.out.printf("\n==== Lista de clientes do Banco %s ====\n", this.nome);
        for(Cliente c : listaClientes){
            System.out.println("cliente: " + c.getNome());
        }
        System.out.printf("\n=======================");
    }

    public void retornaMaiorConta() {
        double maior = Double.MIN_VALUE;
        Conta result = null; // Inicializa como null

        for (Conta c : listaContas) {
            if (c.getSaldo() > maior) {
                maior = c.getSaldo();
                result = c;
            }
        }

        if (result != null) {
            System.out.println("\nConta com maior saldo: ");
            result.imprimirExtrato();
        } else {
            System.out.println("Não há contas cadastradas.");
        }
    }

    public void ordenaContasSaldo(){
        List <Conta> ordenadas = listaContas.stream().sorted(Comparator.comparing(Conta::getSaldo).reversed()).toList();
        // Exibir as contas ordenadas
        System.out.println("\nContas ordenadas por maior saldo:");
        ordenadas.forEach(conta -> System.out.println("Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo()));
    }

}