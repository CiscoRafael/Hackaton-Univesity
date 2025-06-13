package hackaton.universities;

public class Projeto {
    private String titulo;
    private String descricao;
    private Profissional orientador;
    private double notaFinal;
    private Equipe equipe;

    public Projeto(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public void adicionarOrientador(Profissional orientador) {
        if(orientador.isDisponivel() == true){
            this.orientador = orientador;
        } else{
            System.out.println("Orientador indisponivel. Por gentileza escolha outro");
        }
        
    }
    
    public void adicionarEquipeAoProjeto(Equipe equipe) {
        this.equipe = equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public String getDescricao() {
        return descricao;
    }
}
