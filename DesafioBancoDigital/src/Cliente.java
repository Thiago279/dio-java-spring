import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    protected List<Conta> listaContas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public void adicionarConta(Conta conta){
        if(listaContas == null){
            listaContas = new ArrayList<Conta>();
        }
        listaContas.add(conta);
    }


}
