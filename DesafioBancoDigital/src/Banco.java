import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Double.MIN_VALUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Banco {
    public String nome;
    public List<Cliente> listaClientes;

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

    public void adicionarCliente(Cliente cliente){
        if(listaClientes == null){
            listaClientes = new ArrayList<Cliente>();
        }
        listaClientes.add(cliente);
    }


    public void listarClientes(){
        for(Cliente c : listaClientes){
            System.out.printf("\n==== Lista de clientes do Banco %s ====", this.nome);
            System.out.println("\ncliente: " + c.getNome());
        }
    }

   /* public void listaCLientesOrdenadoMaior(){
        double maior = MIN_VALUE;
        for(Cliente c : listaClientes){
            if c.getSaldo()
        }
    }
    
    */

}