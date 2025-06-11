package hackaton.universities;

public class Apresentacao implements Avaliavel {
    private Projeto projeto;
    private Banca banca;
    private double notaFinal;

    public Apresentacao(Projeto projeto, Banca banca) {
        this.projeto = projeto;
        this.banca = banca;
        this.notaFinal = calcularNotaFinal();
        projeto.setNotaFinal(notaFinal); // Atualiza a nota no projeto
    }

    @Override
    public double calcularNotaFinal() {
        return banca.mediaNotas();
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
