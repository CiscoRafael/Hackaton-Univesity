package hackaton.universities;

public class Universidade extends Instituicao{
    private String reitor;
    private boolean credenciamentoMEC;
    private double notaInstitucional;

    public Universidade(String nome, String cnpj, String reitor, boolean credenciamentoMEC,
            double notaInstitucional) {
        super(nome, cnpj);
        this.reitor = reitor;
        this.credenciamentoMEC = credenciamentoMEC;
        this.notaInstitucional = notaInstitucional;
    }
    public String getReitor() {
        return reitor;
    }
    public void setReitor(String reitor) {
        this.reitor = reitor;
    }
    
    public boolean isCredenciamentoMEC() {
        return credenciamentoMEC;
    }
    public void setCredenciamentoMEC(boolean credenciamentoMEC) {
        this.credenciamentoMEC = credenciamentoMEC;
    }
    public double getNotaInstitucional() {
        return notaInstitucional;
    }
    public void setNotaInstitucional(double notaInstitucional) {
        this.notaInstitucional = notaInstitucional;
    }
}
