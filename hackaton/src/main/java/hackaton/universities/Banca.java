package hackaton.universities;

import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados = new HashMap<>();

    public Banca(Projeto projetoAvaliado) {
        adicionarProjeto(projetoAvaliado);
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }
    public void adicionarProjeto(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public void adicionarJurado(Jurado jurado) {
        jurados.put(jurado, null);
    }

    public void lancarNota(Jurado jurado, int nota) {
        jurados.put(jurado, nota);
    }

    @Override
    public double calcularNotaFinal() {
        int soma = 0;
        int count = 0;
        for (Integer nota : jurados.values()) {
            if (nota != null) {
                soma += nota;
                count++;
            }
        }
        if (count > 0) {
            return (double) soma / count;
        } else {
            return 0.0;
        }
    }
}

