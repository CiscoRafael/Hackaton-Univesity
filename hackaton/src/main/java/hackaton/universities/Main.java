package hackaton.universities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Projeto projeto1, projeto2;

        // Criando 2 equipes com 5 estudantes cada (dados fixos)
        Equipe equipe1 = criarEquipeAlpha();
        Equipe equipe2 = criarEquipeBeta();

        Equipes.getInstancia().adicionarEquipe(equipe1);
        Equipes.getInstancia().adicionarEquipe(equipe2);

        // Criar projetos
        projeto1 = new Projeto("Salvando baleias", "Projeto sobre preservação de baleias");
        projeto2 = new Projeto("Vida de inseto", "Ecossistemas de insetos");

        //Adicionando projetos as equipes
        projeto1.adicionarEquipeAoProjeto(Equipes.getInstancia().buscarEquipes().get(0));
        projeto2.adicionarEquipeAoProjeto(Equipes.getInstancia().buscarEquipes().get(1));

        // Criar Universidade
        Universidade uni = new Universidade("PUC", "17.178.195/0014-81", "PUC Minas", true, 5);

        // Criar jurados
        Jurado j1 = new Jurado("Laerte", "lar@gmail.com", uni, "Coordenador Engenharia", true, "IA");
        Jurado j2 = new Jurado("Marcela", "mercela@gmail.com", uni, "Professora", true, "Banco de Dados");
        Jurado j3 = new Jurado("Carlos", "carlos@gmail.com", uni, "Professor", true, "Redes");
        Jurado j4 = new Jurado("Fernanda", "fernanda@gmail.com", uni, "Professora", true, "Engenharia de Software");
        Jurado j5 = new Jurado("João", "joao@gmail.com", uni, "Professor", true, "Algoritmos");
        Jurado j6 = new Jurado("Patrícia", "patricia@gmail.com", uni, "Professora", true, "Sistemas Distribuídos");
        Jurado j7 = new Jurado("Rogério", "rogerio@gmail.com", uni, "Professor", true, "DevOps");
        Jurado j8 = new Jurado("Clara", "clara@gmail.com", uni, "Professora", true, "Engenharia de Requisitos");

        // Criar bancas
        Banca banca1 = new Banca(projeto1);
        banca1.adicionarJurado(j1);
        banca1.adicionarJurado(j2);
        banca1.adicionarJurado(j3);
        banca1.adicionarJurado(j4);

        Banca banca2 = new Banca(projeto2);
        banca2.adicionarJurado(j5);
        banca2.adicionarJurado(j6);
        banca2.adicionarJurado(j7);
        banca2.adicionarJurado(j8);

        // Lançar notas
        banca1.lancarNota(j1, 8);
        banca1.lancarNota(j2, 9); 
        banca1.lancarNota(j3, 7);
        banca1.lancarNota(j4, 7);

        banca2.lancarNota(j5, 6);
        banca2.lancarNota(j6, 5);
        banca2.lancarNota(j7, 6);
        banca2.lancarNota(j8, 10);

        // Criar apresentações e adicionar
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, new Sala("Exatas", 43), LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, new Sala("Humanas", 6), LocalDateTime.now());

        apresentacao1.avaliar();
        Apresentacoes.getInstancia().adicionarApresentacao(apresentacao1);

        apresentacao2.avaliar();
        Apresentacoes.getInstancia().adicionarApresentacao(apresentacao2);

        // Mostrar projetos com nota final >= 7
        System.out.println("\nProjetos com nota final >= 7:");
        List<Apresentacao> aprovados = Apresentacoes.getInstancia().buscarTodasApresentacoes().stream().filter(a -> a.getProjeto().getNotaFinal() >= 7).collect(Collectors.toList());

        for (Apresentacao ap : aprovados) {
            System.out.printf("Projeto: %s | Equipe: %s | Nota Final: %.2f\n",ap.getProjeto().getTitulo(), ap.getProjeto().getEquipe().getNome(), ap.getProjeto().getNotaFinal());
        }
    }

    //Métodos para criar as 2 equipes
    private static Equipe criarEquipeAlpha() {
        Equipe equipe = new Equipe("Equipe Alpha");
        equipe.adicionarEstudante(new Estudante("Alice", "A001"));
        equipe.adicionarEstudante(new Estudante("Bruno", "A002"));
        equipe.adicionarEstudante(new Estudante("Carla", "A003"));
        equipe.adicionarEstudante(new Estudante("Daniel", "A004"));
        equipe.adicionarEstudante(new Estudante("Eduarda", "A005"));
        return equipe;
    }

    private static Equipe criarEquipeBeta() {
        Equipe equipe = new Equipe("Equipe Beta");
        equipe.adicionarEstudante(new Estudante("Felipe", "B001"));
        equipe.adicionarEstudante(new Estudante("Gabriela", "B002"));
        equipe.adicionarEstudante(new Estudante("Henrique", "B003"));
        equipe.adicionarEstudante(new Estudante("Isabela", "B004"));
        equipe.adicionarEstudante(new Estudante("João", "B005"));
        return equipe;
    }

}
