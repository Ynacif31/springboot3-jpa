
# Projeto de Gerenciamento de Usuários e Pedidos

Este projeto é um sistema backend desenvolvido com Spring Boot, focado no gerenciamento de usuários, pedidos, produtos, pagamentos e itens de pedidos. A aplicação expõe APIs REST para operações CRUD, aplicando validações e tratamento de exceções.

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal de desenvolvimento.
- **Spring Boot**: Framework para construção de aplicações Java robustas e eficientes.
- **Spring Data JPA**: Para interações com o banco de dados usando repositórios.
- **Hibernate**: Implementação do JPA para mapeamento objeto-relacional.
- **MySQL**: Banco de dados utilizado para armazenar as informações.
- **Maven**: Ferramenta de build e gerenciamento de dependências.
- **Postman**: Ferramenta para testes de APIs REST.

## Estrutura do Projeto

- **Entities**: Contém as entidades do domínio como `User`, `Order`, `Product`, `Payment`, `OrderItem`.
- **Repositories**: Interfaces que gerenciam a persistência dos dados no banco de dados usando JPA.
- **Services**: Implementa a lógica de negócio e manipulação das entidades.
- **Controllers**: Expondo as APIs REST para as operações com as entidades.

## Funcionalidades

- **Usuários (`User`)**:
  - **Listar todos**: Retorna todos os usuários cadastrados.
  - **Buscar por ID**: Recupera um usuário específico pelo seu ID.
  - **Inserir**: Adiciona um novo usuário ao sistema.
  - **Atualizar**: Atualiza as informações de um usuário existente.
  - **Excluir**: Deleta um usuário, com tratamento de exceções para quando não encontrado.

- **Pedidos (`Order`)**:
  - **Listar todos**: Retorna todos os pedidos cadastrados.
  - **Buscar por ID**: Recupera um pedido específico pelo seu ID.
  - **Criar Pedido**: Registra um novo pedido vinculado a um usuário.
  - **Atualizar Pedido**: Modifica o status do pedido.

- **Produtos (`Product`)**:
  - **Listar todos**: Retorna todos os produtos cadastrados.
  - **Buscar por ID**: Recupera um produto específico pelo seu ID.
  - **Inserir**: Adiciona um novo produto ao sistema.
  - **Atualizar**: Atualiza as informações de um produto existente.
  - **Excluir**: Deleta um produto.

- **Pagamentos (`Payment`)**:
  - **Gerenciar Pagamentos**: Vincula um pagamento a um pedido existente.

## Tratamento de Exceções

- `ResourceNotFoundException`: Lançada quando uma entidade solicitada não é encontrada.
- `DatabaseException`: Lançada em caso de violação de integridade referencial ao manipular dados no banco.
- `EmptyResultDataAccessException`: Tratada ao tentar excluir um recurso que não existe.

## Configuração do Projeto

1. **Pré-requisitos**:
   - Java 17 ou superior.
   - MySQL.
   - Maven.

2. **Configuração do Banco de Dados**:
   - Configure o banco de dados MySQL no arquivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Executando o Projeto**:
   - Clone o repositório:
     ```bash
     git clone https://github.com/seuusuario/projeto-gerenciamento.git
     ```
   - Acesse o diretório do projeto:
     ```bash
     cd projeto-gerenciamento
     ```
   - Execute o projeto com Maven:
     ```bash
     mvn spring-boot:run
     ```

4. **Testando as APIs**:
   - Acesse `http://localhost:8080` e utilize ferramentas como Postman para testar os endpoints disponíveis.
