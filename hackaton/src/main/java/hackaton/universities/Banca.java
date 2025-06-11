package hackaton.universities;

import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel{
    private Map<Jurado, Double> jurados;
    private Projeto projeto;


    public Banca() {
        jurados = new HashMap<>();
    }

    public void adicionarJurado(Jurado jurado, Double nota) {
        if(jurados.size() < 4){
            jurados.put(jurado, nota);
        } else{
            System.out.println("Essa banca já está cheia");
        }
    }

    public void adicionarProjetoABanca(Projeto projeto){
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    @Override
    public double calcularNotaFinal() {
        double notaFinal = 0;
        for(double nota: jurados.values()){
            notaFinal += nota;
        }
        return notaFinal;
    }
}
