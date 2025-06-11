package hackaton.universities;

import java.util.ArrayList;

public class Banca {
    private ArrayList<Jurado> jurados;
    private ArrayList<Double> notas;

    public Banca() {
        jurados = new ArrayList<>();
        notas = new ArrayList<>();
    }

    public void adicionarJurado(Jurado jurado, double nota) {
        jurados.add(jurado);
        notas.add(nota);
    }

    public double mediaNotas() {
        return notas.stream().mapToDouble(n -> n).average().orElse(0);
    }
}
