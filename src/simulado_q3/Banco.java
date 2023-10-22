package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;

    private Set<Agencia> agencias = new HashSet<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public Agencia criaAgencia(String nome){
        Agencia a = new Agencia(nome);
        agencias.add(a);
        return a;
    }
    
    @Override
    public String toString(){
        String saida = "Nome do Banco: " + this.nome + "\n";
        for(Agencia a : agencias){
            saida += a.toString();
        }
        return saida;
    }
}
