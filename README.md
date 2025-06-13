<div align="center">

# 💻 Sistema de Gerenciamento de Hackathons Universitários

**Simulação completa da gestão de equipes, projetos e avaliações em um hackathon universitário.**  
Desenvolvido em Java, com foco em boas práticas de **Programação Modular** e **Orientação a Objetos**.

</div>

<div align="center">

![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Coverage](https://img.shields.io/codecov/c/github/[usuario]/[repositorio]?color=brightgreen)
![Repo Size](https://img.shields.io/github/repo-size/[usuario]/[repositorio])
![Last Commit](https://img.shields.io/github/last-commit/[usuario]/[repositorio])
![Open Issues](https://img.shields.io/github/issues/[usuario]/[repositorio])

</div>

---

## 📘 1. Visão Geral

Este projeto simula a gestão de um **Hackathon Universitário**, desde a formação de equipes até a avaliação final dos projetos. O sistema é inteiramente executado em memória e foi desenvolvido como parte da disciplina de **Programação Modular**.

---

## 🎯 2. Objetivos

- Aplicar conceitos de **modularização**, **encapsulamento** e **reutilização de código**;
- Utilizar **herança**, **interfaces** e **design patterns** para uma arquitetura coesa;
- Praticar a **estruturação em pacotes** e a organização de responsabilidades;
- Demonstrar o uso de **streams** e **coleções genéricas** do Java.

---

## 🧱 3. Arquitetura e Design

A aplicação segue uma arquitetura orientada a objetos, estruturada em pacotes e baseada em um diagrama de classes UML.

### ⚙️ 3.1 Estrutura de Pacotes

| Pacote           | Conteúdo                                                             |
|------------------|----------------------------------------------------------------------|
| `entidades`      | Classes de domínio: `Pessoa`, `Estudante`, `Profissional`, `Projeto`, `Equipe` |
| `controle`       | Lógica de controle: simulação principal (`Main`)                     |
| `avaliacao`      | Interface `Avaliavel` e classe `Banca`                               |
| `gerenciadores`  | Singletons: `Equipes`, `Apresentacoes`                               |

### 🧩 3.2 Padrões e Princípios Aplicados

- **Herança:** `Estudante` e `Profissional` herdam de `Pessoa`, promovendo reutilização;
- **Interface `Avaliavel`:** Abstrai a lógica de avaliação, promovendo flexibilidade;
- **Singleton:** `Equipes` e `Apresentacoes` garantem acesso global e seguro às coleções.

---

## 🚀 4. Funcionalidades Implementadas

A simulação principal (`Main.java`) cobre todo o fluxo esperado para o gerenciamento de um hackathon:

- 👥 **Criação de Equipes:** 2 equipes, cada uma com 5 estudantes;
- 📁 **Submissão de Projetos:** Um projeto atribuído por equipe;
- 🧑‍⚖️ **Formação da Banca:** Cada projeto é avaliado por 4 jurados;
- 📊 **Avaliação e Média:** Média final calculada com base nas notas;
- ✅ **Filtragem de Aprovados:** Uso de `Stream API` para exibir somente projetos com nota ≥ 7.0.

---

## 🧪 5. Pré-requisitos

- Java Development Kit (JDK) **11** ou superior instalado e configurado no `PATH`.

---

## 🛠️ 6. Instruções de Execução

```bash
# 1. Clone o repositório
git clone https://github.com/[usuario]/[repositorio].git

# 2. Acesse o diretório do projeto
cd [repositorio]

# 3. Compile os arquivos-fonte
javac -d bin src/*.java

# 4. Execute a simulação
java -cp bin Main
