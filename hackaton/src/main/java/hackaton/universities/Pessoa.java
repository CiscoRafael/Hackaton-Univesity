package hackaton.universities;

abstract class  Pessoa {
    public Pessoa(String nome, String email, Instituicao instituicao) {
        this.nome = nome;
        this.email = email;
        Instituicao = instituicao;
    }

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
