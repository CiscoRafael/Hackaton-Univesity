package hackaton.universities;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Equipes equipes = Equipes.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();
        Projeto projeto;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        for(int i = 0; i<2; i++){
            System.out.println("Informe o nome da equipe");
            Equipe equipe = new Equipe(input.nextLine());  
            for(int j = 0; j<5; j++){
                System.out.println("Informe o nome do aluno e a matricula");
                Estudante estudante = new Estudante(input.nextLine(), input.nextLine());
                equipe.adicionarEstudante(estudante);             
            }
            equipes.adicionarEquipe(equipe);
        } 

        projeto = new Projeto("Salvando baleias");
        projeto.adicionarEquipeAoProjeto(equipes.buscarEquipes().get(random.nextInt(1)));
        System.out.println(projeto.getEquipe().getNome());
        input.close();

        
    }
}