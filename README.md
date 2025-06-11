# 💻 Sistema de Gerenciamento de Hackathons Universitários

### Projeto da disciplina de Programação Modular

Este repositório contém a implementação de um **Sistema de Gerenciamento de Hackathons Universitários**, desenvolvido como atividade avaliativa para a disciplina de Programação Modular do curso de Engenharia de Software da PUC Minas.

---

## 👥 Participantes e Professor

* **Professor:** Daniel Kansaon
* **Alunos:**
    * Francisco Rafael P. Rodrigues
    * João R. Fiuza

---

## 💡 Conceito do Sistema

O projeto simula um ambiente de gerenciamento para hackathons, focando nos processos de organização de equipes, submissão de projetos e avaliação. O sistema foi projetado para gerenciar todas as suas entidades e coleções em memória principal, servindo como uma solução prática e autocontida.

---

## 🛠️ Arquitetura e Design

A arquitetura do sistema foi desenvolvida em Java, seguindo os princípios da orientação a objetos e utilizando um diagrama de classes UML como base.

### Diagrama de Classes UML

A estrutura do sistema é baseada em um diagrama de classes que modela as entidades centrais do hackathon. As principais abstrações incluem:

* **Pessoas e Instituições:** Classes como `Pessoa`, `Estudante`, `Profissional`, e `Instituicao` criam uma base sólida e extensível para representar os diferentes atores do evento.
* **Componentes do Hackathon:** Classes como `Equipe`, `Projeto`, `Banca` e `Apresentacao` representam os elementos centrais e dinâmicos da competição.

### Padrão de Projeto Singleton

Para garantir um ponto de acesso único e global às coleções de dados, o projeto utiliza o padrão **Singleton** nas classes `Equipes` e `Apresentacoes`. Essa escolha de design assegura que, durante toda a execução, exista apenas uma instância responsável por gerenciar o conjunto de equipes e de apresentações, evitando inconsistências.

### Interface `Avaliavel`

A interface `Avaliavel` foi utilizada para desacoplar a lógica de avaliação. Ela define um contrato que qualquer classe avaliadora (como a `Banca`) deve seguir, permitindo que a classe `Apresentacao` interaja com um tipo abstrato, sem conhecer os detalhes de implementação da avaliação.

---

## ⚙️ Cenário de Demonstração

A classe `Main` foi desenvolvida para simular um cenário de uso real, demonstrando as principais funcionalidades do sistema:

1.  **Criação de Entidades:** São instanciadas duas equipes, cada uma com cinco alunos.
2.  **Desenvolvimento de Projetos:** Um projeto diferente é atribuído a cada equipe.
3.  **Formação da Banca:** Para cada projeto, é montada uma banca avaliadora com quatro jurados.
4.  **Processo de Avaliação:** A nota final de cada projeto é calculada a partir da média das notas dadas pelos jurados.
5.  **Resultados:** Ao final, o sistema lista os projetos aprovados (com nota final $\ge7$), utilizando o recurso de `stream` do Java para a filtragem.

---

## 🚀 Guia de Execução

Para executar a simulação, é necessário ter o **JDK (Java Development Kit)** instalado.

1.  **Clone o repositório:**
    ```bash
    git clone [URL-do-seu-repositorio]
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd [nome-do-diretorio-do-projeto]
    ```

3.  **Compile os arquivos `.java`:**
    O comando abaixo compila os arquivos da pasta `src` e os organiza na pasta `bin`.
    ```bash
    javac -d bin src/*.java
    ```

4.  **Execute a classe principal:**
    Este comando inicia a simulação definida no `main`.
    ```bash
    java -cp bin Main
    ```

A saída no console exibirá a lista de projetos aprovados, de acordo com os critérios definidos.
