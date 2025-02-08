
# Projeto de API de Cadastro de Clientes

Este projeto é uma API desenvolvida utilizando Java Spring, com foco na aplicação de Design Patterns como **Facade**, **Strategy**, e **Singleton**, além de integração com a API ViaCep para consulta de endereços.

## Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot** (com **Spring Web**, **Spring Data JPA**, **Spring Feign**)
- **Swagger** (para documentação da API)
- **H2 Database** (para persistência em memória)
- **OpenFeign** (para integração com a API ViaCep)

## Dependências

As dependências principais são:

- **Swagger** para documentação interativa da API
- **H2 Database** para banco de dados em memória
- **Spring Data JPA** para persistência de dados
- **OpenFeign** para consumir a API ViaCep

## Funcionalidades

A API possui as seguintes funcionalidades:

- **Cadastro de Clientes**: O cliente pode ser cadastrado passando apenas o nome e o cep. A API irá consultar o endereço automaticamente por meio da API ViaCep.
- **Busca de Clientes**: É possível buscar todos os clientes ou um cliente específico por seu ID.
- **Atualização e Deleção de Clientes**: O cliente pode ser atualizado ou deletado a partir do seu ID.

## Endpoints da API

Abaixo estão os principais endpoints da API:

- `GET /clientes`: Retorna todos os clientes cadastrados.
- `GET /clientes/{id}`: Retorna um cliente específico pelo ID.
- `POST /clientes`: Cria um novo cliente (informa nome e cep).
- `PUT /clientes/{id}`: Atualiza um cliente pelo ID.
- `DELETE /clientes/{id}`: Deleta um cliente pelo ID.

## Design Patterns Implementados

- **Facade**: A classe `ClienteServiceImpl` atua como um *facade*, simplificando o processo de cadastro do cliente ao permitir que o mesmo seja registrado com apenas o nome e cep. O endereço é buscado automaticamente pela API ViaCep.
- **Strategy**: A lógica para tratamento de dados pode ser configurada para diferentes comportamentos no futuro, se necessário.
- **Singleton**: O padrão Singleton pode ser observado na configuração de alguns serviços que devem ter uma única instância durante a execução.

## Instalação e Execução

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```

3. Compile e execute o projeto:
    ```bash
    ./mvnw spring-boot:run
    ```

4. Abra o Swagger em seu navegador para interagir com a API:
    ```bash
    http://localhost:8080/swagger-ui.html
    ```

## Testes

Os testes podem ser realizados diretamente no Swagger ou utilizando ferramentas como **Postman**.

## Observações

- **API ViaCep**: A API utiliza a consulta de CEPs através da API pública ViaCep para buscar automaticamente os endereços dos clientes.
- **Banco de Dados em Memória**: O H2 foi utilizado como banco de dados em memória para simplificação e testes rápidos. Você pode alterar a configuração do banco de dados no arquivo `application.properties` se necessário.

## Desafio DIO | Bradesco
Esse projeto foi desenvolvido como um desafio do bootcamp Java da DIO em parceria com o Bradesco
