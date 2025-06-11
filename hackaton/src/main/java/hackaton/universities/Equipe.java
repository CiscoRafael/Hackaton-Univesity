package hackaton.universities;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Estudante> estudantes = new ArrayList<>();
    private Projeto projeto;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
