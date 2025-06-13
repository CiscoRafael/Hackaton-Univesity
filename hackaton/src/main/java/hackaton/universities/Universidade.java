package hackaton.universities;

import java.util.List;

public class Universidade extends Instituicao{
    private String reitor;
    private List<String> campos;
    private boolean credenciamentoMEC;
    private double notaInstitucional;

    
    public String getReitor() {
        return reitor;
    }
    public void setReitor(String reitor) {
        this.reitor = reitor;
    }
    public List<String> getCampos() {
        return campos;
    }
    public void setCampos(List<String> campos) {
        this.campos = campos;
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
