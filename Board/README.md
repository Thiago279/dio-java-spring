# Board de Tarefas com JDBC

## Descrição

Este projeto é um sistema de gerenciamento de tarefas baseado em boards, desenvolvido em Java. Ele utiliza JDBC para integrar-se a um banco de dados relacional, permitindo a criação, edição e exclusão de boards e tarefas. O sistema é acessado por meio de um menu interativo no terminal.

## Funcionalidades

- Criar, selecionar e excluir boards
- Criar e gerenciar colunas dentro de um board
- Criar, mover, bloquear e desbloquear cards
- Visualizar detalhes dos boards, colunas e cards

## Tecnologias Utilizadas

- **Java 17**
- **JDBC** para conexão com banco de dados
- **Banco de Dados Relacional (MySQL)**
- **Lombok** para reduzir boilerplate
- **Maven** para gerenciamento de dependências
- **DBeaver** para visualizar o Banco de dados

## Configuração e Execução

### 1. Clonar o Repositório
```bash
git clone https://github.com/seu-usuario/board-tarefas.git
cd board-tarefas
```

### 2. Configurar o Banco de Dados

Certifique-se de criar um banco de dados e configurar o arquivo de conexão em `ConnectionConfig.java`:
```java
private static final String URL = "jdbc:mysql://localhost:3306/board_db";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";
```

Crie as tabelas necessárias executando o script SQL correspondente na pasta `scripts/`.

### 3. Compilar e Executar

```bash
mvn clean install
java -jar target/board-tarefas.jar
```

## Uso

Ao executar a aplicação, você verá o seguinte menu:
```
Bem-vindo ao gerenciador de boards, escolha a opção desejada:
1 - Criar um novo board
2 - Selecionar um board existente
3 - Excluir um board
4 - Sair
```

Após selecionar um board, você terá opções para gerenciar as tarefas, como criar, mover, bloquear e desbloquear cards.



## Bootcamp
Esse projeto foi desenvolcido como um desafio focado em Java jdbc durante um Bootcamp da DIO em parceria com o banco Bradesco.
