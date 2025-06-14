package hackaton.universities;

public class Jurado extends Profissional{
    public Jurado(String nome, String email, Instituicao instituicao, String cargo,
            boolean disponivel, String areaEspecializacao) {
        super(nome, email, instituicao, cargo, disponivel);
        this.areaEspecializacao = areaEspecializacao;
    }

    private String areaEspecializacao;

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}
