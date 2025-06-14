package hackaton.universities;

public class Sala {
    private String predio;
    private int numero;

    public Sala(String predio, int numero) {
        this.predio = predio;
        this.numero = numero;
    }

    public String getPredio() {
        return predio;
    }

    public int getNumero() {
        return numero;
    }
}
