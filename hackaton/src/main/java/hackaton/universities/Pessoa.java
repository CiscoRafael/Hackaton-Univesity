package hackaton.universities;

abstract class  Pessoa {
    private String nome, email;
    private Instituicao instituicao;

    public Pessoa(String nome, String email, Instituicao instituicao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
    }

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
        return instituicao;
    }
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }    
}
