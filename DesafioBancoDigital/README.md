# Banco Digital - Desafio Bootcamp Java DIO & Santander

## 📌 Sobre o Projeto
Este é um projeto desenvolvido como parte do **Bootcamp Java** da [DIO](https://www.dio.me/) em parceria com o **Santander**. O objetivo principal foi exercitar conceitos de **Programação Orientada a Objetos (POO)**, explorando seus quatro pilares: **Herança, Polimorfismo, Abstração e Encapsulamento**.

## 🚀 Tecnologias Utilizadas
- **Java** (JDK 17+ recomendado)
- **Paradigma Orientado a Objetos (POO)**
- **Java Collections API**
- **Stream API**

## 🏛️ Estrutura do Projeto
O projeto é um sistema bancário simples que permite criar clientes, abrir contas e realizar operações bancárias. Os principais componentes incluem:

### 🏦 Classe `Banco`
- Mantém um registro das contas e clientes do banco.
- Métodos adicionais implementados:
  - **Listagem de clientes por banco**
  - **Retorno da conta com maior saldo**
  - **Ordenação das contas por saldo em ordem decrescente** (usando **Stream API**)

### 💳 Classe `Conta` (Abstrata)
- Representa uma conta bancária genérica.
- Possui atributos como **saldo, agência, número e cliente**.
- Define métodos comuns para todas as contas, como `sacar()`, `depositar()` e `transferir()`.

### 📌 Classes `ContaCorrente` e `ContaPoupanca`
- Herdam de `Conta` e possuem características próprias.
- Implementam comportamento específico para cada tipo de conta.

## 🔍 Implementações Adicionais
Além do desafio proposto no bootcamp, foram implementadas funcionalidades extras:
- **Ordenação de contas por saldo (decrescente)** usando `Stream API`.
- **Busca da conta com maior saldo** de forma eficiente.
- **Listagem de clientes por banco**.

## ⚙️ Como Executar
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/banco-digital.git
   ```
2. **Abra o projeto em uma IDE compatível** (IntelliJ IDEA, Eclipse, VS Code com extensão Java, etc.).
3. **Compile e execute a classe principal**.
4. **Interaja com o sistema para criar clientes, abrir contas e realizar operações.**

## 📜 Conclusão
Este projeto proporcionou um aprendizado prático e aprofundado sobre **POO em Java**, além de explorar **coleções, generics e Stream API**. Foi uma excelente oportunidade para consolidar conhecimentos essenciais para o desenvolvimento back-end com Java.

---
🚀 **Bootcamp Java DIO & Santander** | 🏆 Desenvolvido por *[Seu Nome]*

