package hackaton.universities;

public class Sala {
    private String codigo, localizacao;
    private int capacidade;

    public Sala(String codigo, String localizacao, int capacidade) {
        this.codigo = codigo;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
}
