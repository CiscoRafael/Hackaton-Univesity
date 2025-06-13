package hackaton.universities;

import java.util.ArrayList;

public class Apresentacoes {
    private ArrayList<Apresentacao> apresentacoes;
    private static Apresentacoes instancia;

    private Apresentacoes(){
        apresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstancia(){
        if(instancia == null){
            instancia = new Apresentacoes(); 
        }
        return instancia;
    }

    public void adicionarApresentacao(Apresentacao apresentacao){
        apresentacoes.add(apresentacao);
    }

    public ArrayList<Apresentacao> buscarTodasApresentacaos() {
        return apresentacoes;
    }
}

