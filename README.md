<div align="center">
  <img src="docs/assets/imagens/ChatGPT Image 14 de jun. de 2025, 15_14_53.png" alt="Diagrama UML do Sistema" width="800"/>
</div>

<div align="center">

# **Plataforma acadêmica para gestão de equipes, projetos, bancas e apresentações em Hackathons Universitários.**
Desenvolvido em **Java 11+**, com foco em **orientação a objetos**, **padrões de projeto** e **simulação em memória**.

</div>

<div align="center">

![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Coverage](https://img.shields.io/codecov/c/github/usuario/repositorio?color=brightgreen)
![Repo Size](https://img.shields.io/github/repo-size/usuario/repositorio)
![Last Commit](https://img.shields.io/github/last-commit/usuario/repositorio)
![Open Issues](https://img.shields.io/github/issues/usuario/repositorio)

</div>

---

## ✪ Sumário

* [👥 Equipe](#-equipe)
* [📘 Visão Geral](#-visão-geral)
* [🎯 Objetivos](#-objetivos)
* [🧱 Arquitetura e Design](#-arquitetura-e-design)

* [⚙️ Estrutura de Pacotes](#%EF%B8%8F-estrutura-de-pacotes)
* [🧹 Padrões e Princípios](#-padrões-e-princ%C3%ADpios)
* [🚀 Funcionalidades](#-funcionalidades)
* [🧪 Requisitos](#-requisitos)
* [🛠%ef%b8%8f Execução](#%EF%B8%8F-execu%C3%A7%C3%A3o)

---

## 👥 Equipe

* **Professor Orientador:** Daniel Kansaon
* **Desenvolvedores:**

  * Francisco Rafael P. Rodrigues
  * João Ricardo Fiuza

---

## 📘 Visão Geral

Este projeto simula, de forma modular e didática, um **Hackathon Universitário**, desde a criação das equipes, submissão de projetos, formação da banca e avaliação das apresentações.

* 🔄 100% em memória: sem dependências externas ou banco de dados.
* 📊 Forte abstração via classes, herança, interfaces e polimorfismo.
* 📚 Projeto desenvolvido para a disciplina de **Programação Modular (2º semestre)**.

---

## 🎯 Objetivos

* Estruturar uma arquitetura **modular, coesa e reutilizável**;
* Aplicar padrões como **Singleton** e **Strategy (via interface Avaliavel)**;
* Trabalhar com **coleções genéricas** e **Stream API** do Java;
* Realizar uma **simulação completa** do ciclo de um hackathon.

---

## 🧱 Arquitetura e Design

### ⚙️ Estrutura de Pacotes

| Pacote          | Responsabilidade                                                                 |
| --------------- | -------------------------------------------------------------------------------- |
| `entidades`     | Modelagem de domínio: `Pessoa`, `Estudante`, `Profissional`, `Equipe`, `Projeto` |
| `controle`      | Fluxo principal da aplicação e orquestração de eventos (`Main`)                  |
| `avaliacao`     | Avaliação de projetos: `Banca`, interface `Avaliavel`                            |
| `gerenciadores` | Gerenciamento global com Singleton: `Equipes`, `Apresentacoes`                   |

### 🧹 Padrões e Princípios

* **Herança:** `Estudante` e `Profissional` extendem `Pessoa`;
* **Interface `Avaliavel`:** abstrai a lógica de avaliação de projetos;
* **Singleton:** garante consistência nas coleções gerenciadas pelo sistema;
* **SRP e Baixo Acoplamento:** cada classe tem responsabilidade única.

---

## 🚀 Funcionalidades

* 👥 **Equipes**: 2 equipes com 5 estudantes cada;
* 📂 **Projetos**: submetidos e associados às equipes;
* 🧑‍⚖️ **Jurados**: 4 jurados por banca avaliadora;
* 📊 **Avaliações**: notas atribuídas individualmente, com cálculo da média;
* 📋 **Filtro Aprovados**: uso de `Streams` para exibir apenas projetos com nota ≥ 7.0.

---

## 🧪 Requisitos

* Java Development Kit (JDK) **11** ou superior
* Terminal com suporte a comandos `javac` e `java`

---

## 🛠️ Execução

```bash
# 1. Clone o repositório
$ git clone https://github.com/usuario/repositorio.git

# 2. Acesse a pasta do projeto
$ cd repositorio

# 3. Compile os arquivos
$ javac -d bin src/**/*.java

# 4. Execute a aplicação
$ java -cp bin controle.Main
```

---

> © 2025 - Projeto acadêmico criado para fins didáticos. Todos os direitos reservados aos autores.
