package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nome;

    public String getNome() {
        return nome;
    }

    private Set<Conta> contas = new HashSet<>();

    public Agencia(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(Conta a){
        contas.add(a);
    }
    

    @Override
    public String toString(){
        String saida = "Agência: "+this.nome +", saldo médio: ";
        double saldoMedio = 0;
        int i = 0;
        for(Conta c : contas){
           saldoMedio += c.getSaldo();
           i++;
        }
        saldoMedio /= i;
        saida += saldoMedio;
        saida += "\n";
        return saida;
    }
}
