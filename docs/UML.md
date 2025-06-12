

## 📋 Diagrama UML 1.0

---


## 🏗️ Arquitetura e Diagrama de Classes

O diagrama de classes abaixo representa a arquitetura do Sistema de Gerenciamento de Hackathons. Ele foi modelado para refletir as entidades, seus relacionamentos e as principais funcionalidades do projeto, servindo como a base para toda a implementação em Java.

![**DIAGRAMA UML**](/assets/imagens/diagrama-uml.jpg.png)

### Detalhamento da Estrutura

A arquitetura do sistema é dividida em três grupos lógicos principais:

#### 1. Entidades e Atores
Este grupo define as classes base e os diferentes tipos de pessoas envolvidas no hackathon, utilizando **herança** para criar uma estrutura clara e extensível.

* **`Instituicao`** (Abstrata): Classe base que representa uma organização, como uma `Universidade` ou `Empresa`.
* **`Pessoa`** (Abstrata): Generalização para um indivíduo no sistema, contendo dados comuns como nome e e-mail, e associada a uma `Instituicao`.
* **`Estudante`**: Um participante do hackathon que compõe uma `Equipe`.
* **`Profissional`**: Pode atuar como `Orientador` de um projeto ou como `Jurado`.
* **`Jurado`**: Especialização de `Profissional`, responsável por avaliar os projetos em uma `Banca`.

#### 2. Componentes do Hackathon
Este grupo representa as entidades centrais que compõem o evento.

* **`Equipe`**: Um grupo de `Estudante`s que trabalha em um `Projeto`.
* **`Projeto`**: O trabalho desenvolvido pela `Equipe`, que possui um `Orientador` e recebe uma `notaFinal`.
* **`Banca`**: O comitê de `Jurado`s responsável por avaliar um `projetoAvaliado`.
* **`Apresentacao`**: O evento de avaliação em si, que conecta um `Projeto`, uma `Banca` e um `local` (`Sala`) em uma data e hora específicas.
* **`Sala`**: O local físico onde a apresentação ocorre.

#### 3. Padrões de Design e Interfaces
Este grupo destaca as decisões de arquitetura que garantem a flexibilidade e a organização do código.

* **`Avaliavel`** (Interface): Define um contrato com o método `calcularNotaFinal()`. A classe `Banca` implementa essa interface, o que permite desacoplar a lógica de avaliação da apresentação.
* **`Equipes`** e **`Apresentacoes`** (Singletons): São classes de coleção que seguem o padrão de projeto **`Singleton`**. Elas garantem que exista apenas uma única instância para gerenciar todos os objetos `Equipe` e `Apresentacao` no sistema, fornecendo um ponto de acesso global e controlado.
