package hackaton.universities;

public class Profissional extends Pessoa{
    
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
