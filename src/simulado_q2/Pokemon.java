package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int vitalidade;
    private int vitalidadeAtual;
    private int ataque1;
    private int ataque2;

    public Pokemon(int vitalidade, int ataque1, int ataque2) {
        this.vitalidade = vitalidade;
        this.vitalidadeAtual = vitalidade;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {

        Random r = new Random();
 		
        
        if(r.nextBoolean()){
            personagemAtacado.vitalidadeAtual -= this.ataque1;
        }else{
            personagemAtacado.vitalidadeAtual -= this.ataque2;
        }
        if(personagemAtacado.vitalidadeAtual <= 0){
            personagemAtacado.vitalidadeAtual = 0;
            return true;
        }
        return false;
    }

    @Override
    public void regenera() {
        this.vitalidadeAtual = this.vitalidade;
    }

    @Override
    public int getPontosVitalidade() {
        return this.vitalidadeAtual;
    }
    
}
