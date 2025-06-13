package hackaton.universities;

abstract class  Pessoa {
    private String nome, email;
    private Instituicao Instituicao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Instituicao getInstituicao() {
        return Instituicao;
    }
    public void setInstituicao(Instituicao instituicao) {
        Instituicao = instituicao;
    }    
    
}
