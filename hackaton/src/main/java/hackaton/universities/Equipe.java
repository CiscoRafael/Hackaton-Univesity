package hackaton.universities;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Estudante> estudantes = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarEstudante(Estudante estudante) {
        if(estudantes.size() < 5){
            estudantes.add(estudante);
        } else{
            System.out.println("A equipe já está cheia");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }
}
