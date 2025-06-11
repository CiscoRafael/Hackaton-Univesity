package hackaton.universities;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala sala;
    private LocalDateTime dataHora;
    private double notaFinal;

    public Apresentacao(Projeto projeto, Avaliavel banca, Sala sala, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.sala = sala;
        this.dataHora = dataHora;
    }

    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Avaliavel getBanca() {
        return banca;
    }
    public void setBanca(Avaliavel banca) {
        this.banca = banca;
    }

    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void avaliar(){
        System.out.println("A nota do projeto foi " + banca.calcularNotaFinal());
    }
    
}
