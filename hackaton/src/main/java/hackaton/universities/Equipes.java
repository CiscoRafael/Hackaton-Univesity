package hackaton.universities;

import java.util.ArrayList;

public class Equipes {
    private ArrayList<Equipe> equipes;
    private static Equipes instancia;

    private Equipes(){
        equipes = new ArrayList<>();
    }

    public static Equipes getInstancia(){
        if(instancia == null){
            instancia = new Equipes();
        }
        return instancia;
    }
    
    
    public void adicionarEquipe(Equipe equipe){
        equipes.add(equipe);
    }

    public Equipe buscarEquipePorNome(String nome){
        for(Equipe e : equipes){
            if (e.getNome().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Equipe> buscarEquipes(){
        return equipes;
    }
}
