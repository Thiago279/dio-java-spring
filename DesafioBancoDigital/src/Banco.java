import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Double.MIN_VALUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

   /*public void listaContasOrdenadoMaior(){
        double maior = MIN_VALUE;
        Conta result;
        for(Conta c : listaContas){
            if (c.getSaldo()> maior){
                maior = c.getSaldo();
                result = c;
            }
        }
    }*/



}