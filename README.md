# Cadastro de Animais

## Aluno
Calebe dos Santos Farias

## Nome do sistema
Cadastro de Animais

## Descrição
Sistema web desenvolvido para cadastro e gerenciamento de animais. A aplicação permite cadastrar, listar, editar e excluir animais, utilizando Spring MVC, Thymeleaf, Bean Validation, Spring Data JPA e PostgreSQL.

## Tecnologias utilizadas
- Java 21
- Spring Boot
- Spring MVC
- Thymeleaf
- Bean Validation
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- HTML e CSS

## Banco de dados
Nome: springbd

## Estrutura
- controller: recebe as requisições da aplicação
- service: concentra as regras e operações do sistema
- repository: realiza a comunicação com o banco através do Spring Data JPA
- model: contém a entidade Animal
- templates: páginas Thymeleaf
- static/css: arquivo de estilos

## Atributos do animal
- id
- nome
- especie
- raca
- idade
- sexo
- cor

## Como executar

1. Crie um banco PostgreSQL chamado `springbd`.
2. Abra o projeto no NetBeans.
3. Confira no arquivo `src/main/resources/application.properties` o usuário e a senha do PostgreSQL.
4. Execute o projeto pela classe `DemoApplication`.
5. Acesse no navegador:

http://localhost:8080/animais

## Exemplo de configuração
A aplicação está configurada inicialmente com:

spring.datasource.url=jdbc:postgresql://localhost:5432/springbd
spring.datasource.username=postgres
spring.datasource.password=postgres

Altere usuário e senha conforme a configuração do PostgreSQL instalado no computador.
