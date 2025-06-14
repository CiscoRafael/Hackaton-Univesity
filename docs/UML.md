# 🎓 Sistema Hackaton-Univesity
[![Java](https://img.shields.io/badge/linguagem-Java-orange.svg)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/build-sucesso-brightgreen.svg)]()
[![Versão](https://img.shields.io/badge/versão-1.0.0-blue.svg)]()
[![Licença](https://img.shields.io/badge/licença-MIT-lightgrey.svg)]()

---

## 📚 Sumário

- [🧠 Visão Geral](#-visão-geral)
- [🧱 Estrutura Arquitetural](#-estrutura-arquitetural)
  - [1️⃣ Entidades de Domínio](#1️⃣-entidades-de-domínio)
  - [2️⃣ Funcionalidades Centrais](#2️⃣-funcionalidades-centrais)
  - [3️⃣ Padrões de Projeto](#3️⃣-padrões-de-projeto)
- [✅ Considerações Finais](#-considerações-finais)
- [👥 Equipe de Desenvolvimento](#-equipe-de-desenvolvimento)

---

## 🧠 Visão Geral

O **Sistema de Gerenciamento de Apresentações Acadêmicas** foi projetado com base em princípios fundamentais da **Programação Orientada a Objetos (POO)**. A arquitetura prioriza:

- 🔄 Reutilização de código
- 🧩 Baixo acoplamento
- 🧱 Alta coesão
- 🚀 Manutenibilidade e escalabilidade

Abaixo está o diagrama UML que representa a estrutura lógica do sistema, modelando entidades, relacionamentos e responsabilidades.

<div align="center">
  <img src="assets/imagens/UML2.0.png" alt="Diagrama UML do Sistema" width="800"/>
</div>

---

## 🧱 Estrutura Arquitetural

O sistema está organizado em três grandes camadas funcionais:

---

### 1️⃣ Entidades de Domínio

Modelam os participantes envolvidos no processo de avaliação acadêmica.

#### 🏛 Instituição

- **`Instituicao`** *(abstrata)*  
  Representa uma entidade acadêmica (ex: universidade).  
  Atributos: `nome`, `cnpj`

#### 👤 Pessoas

- **`Pessoa`** *(abstrata)*  
  Classe base para todos os indivíduos do sistema.  
  Atributos: `nome`, `email`, `instituicao`

- **`Estudante`**  
  - Participa de uma equipe  
  - Atributo adicional: `matricula`

- **`Profissional`**  
  - Atua como orientador ou jurado  
  - Atributos: `cargo`, `disponibilidade`

- **`Jurado`** *(especialização de Profissional)*  
  - Atributo: `areaEspecializacao`

> ✅ A estrutura usa **herança** para evitar duplicidade e refletir o domínio acadêmico com precisão.

---

### 2️⃣ Funcionalidades Centrais

Define os principais processos do sistema: projetos, equipes, avaliações e apresentações.

#### 👥 Equipe

- Grupo de estudantes
- Associada a um projeto

#### 📁 Projeto

- Desenvolvido por uma equipe
- Orientado por um profissional
- Possui nota final

#### 🧑‍⚖️ Banca

- Composta por um ou mais jurados
- Responsável por avaliar os projetos
- Implementa `calcularNotaFinal()`

#### 📅 Apresentação

- Evento formal de avaliação
- Relaciona um `Projeto`, `Banca`, `Sala` e `dataHora`

#### 🏫 Sala

- Local físico da apresentação
- Atributos: `predio`, `numero`

> 🔄 Esses componentes modelam o ciclo acadêmico completo, da formação da equipe até a entrega e avaliação do projeto.

---

### 3️⃣ Padrões de Projeto

Uso de boas práticas de engenharia de software.

#### ✅ Interface `Avaliavel`

- Define o contrato de avaliação via `calcularNotaFinal()`
- Implementada por `Banca` para possibilitar polimorfismo

#### 🔁 Padrões Singleton

- **`Equipes`**  
  Gerencia todas as equipes  
  Garante uma única instância global

- **`Apresentacoes`**  
  Controlador centralizado de todas as apresentações  
  Também utiliza o padrão Singleton

> 🧠 Esses padrões asseguram **controle global e acesso padronizado** aos dados dinâmicos.

---

## ✅ Considerações Finais

- O diagrama UML foi a **referência principal para a implementação em Java**, respeitando os princípios de modelagem.
- A arquitetura permite:
  - 🔧 Manutenção facilitada
  - 📈 Evolução escalável
  - 🤝 Colaboração entre desenvolvedores com coesão
- Possíveis expansões:
  - Fases intermediárias do evento
  - Novos tipos de participantes
  - Geração de relatórios analíticos

---

## 👥 Equipe de Desenvolvimento

- João Ricardo Fiuza –  Modelador UML  
- Francisco Rafael Pereira Rodrigues – Desenvolvedor  
 

**Professor orientador:** Prof. Daniel Pimentel Kansaon

---

© 2025 - Desenvolvido para fins acadêmicos.
