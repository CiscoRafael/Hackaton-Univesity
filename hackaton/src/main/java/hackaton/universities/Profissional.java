package hackaton.universities;

public class Profissional extends Pessoa{
    public Profissional(String nome, String email, Instituicao instituicao, String cargo,
            boolean disponivel) {
        super(nome, email, instituicao);
        this.cargo = cargo;
        this.disponivel = disponivel;
    }

    private String cargo;
    private boolean disponivel;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
