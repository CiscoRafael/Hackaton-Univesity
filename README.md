# 💻 Sistema de Gerenciamento de Hackathons Universitários

[cite_start]Projeto desenvolvido como atividade avaliativa para a disciplina de Programação Modular do curso de Engenharia de Software da PUC Minas - Campus Coração Eucarístico.

---

## 👥 Participantes e Professor

* **Professor:** Daniel Kansaon 
* **Alunos:**
    * Francisco Rafael P. Rodrigues
    * João R. Fiuza

---

## 📜 Visão Geral do Projeto

Este projeto implementa um sistema para gerenciar um Hackathon Universitário [cite: 2][cite_start], com foco na administração de **Projetos** e **Equipes** participantes. [cite_start]Toda a aplicação é, a princípio, gerenciada em memória principal.

---

## 🏗️ Estrutura e Funcionalidades

A solução foi implementada em Java, partindo de um diagrama de classes UML inicial. A simulação no `main` demonstra as seguintes funcionalidades:

* Criação de 2 equipes, cada uma com 5 alunos.
* Associação de um projeto diferente para cada equipe.
* Criação de uma banca avaliadora para cada projeto, contendo 4 jurados.
* Cálculo da nota final de cada projeto, que corresponde à média das notas dos jurados.
* Listagem de todos os projetos com nota final igual ou superior a 7, utilizando `stream`.

### Padrão de Projeto Singleton

Para centralizar o controle de dados, foram criadas classes de coleção como `Equipes` e `Apresentacoes`. Essas classes seguem o padrão de projeto **Singleton**, garantindo uma única instância de cada coleção em todo o sistema.

---

## 🚀 Como Executar

Para compilar e executar o projeto, siga os passos abaixo.

1.  **Clone o repositório:**
    ```bash
    git clone [URL-do-seu-repositorio]
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd [nome-do-diretorio-do-projeto]
    ```

3.  **Compile os arquivos `.java`:**
    O comando abaixo compila os arquivos da pasta `src` e os coloca em uma pasta `bin`.
    ```bash
    javac -d bin src/*.java
    ```

4.  **Execute a classe principal:**
    Este comando executa a simulação.
    ```bash
    java -cp bin Main
    ```
