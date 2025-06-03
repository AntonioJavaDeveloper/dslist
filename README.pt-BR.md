# 📚 Game List API

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)

Este projeto é uma API REST desenvolvida com **Spring Boot 3** e **Java 21**, com o objetivo principal de **demonstrar os fundamentos da arquitetura REST** dentro do ecossistema Spring. Foi estruturada para servir como uma consulta de **boas práticas de organização de código**, e exemplo de uso das principais **anotações do Spring Framework**.

## 🎯 Objetivo

O projeto **Game List API** simula uma lista de jogos e suas posições em rankings. Embora seja uma aplicação simples, a intenção é apresentar de forma clara e prática:

- A organização em camadas (controller, service, repository, DTO, etc);
- A configuração básica do Spring Boot;
- O uso de anotações como `@RestController`, `@Service`, `@Repository`, `@Entity`, `@Transactional`, `@Autowired`, etc;
- A criação de projeções (interface-based) com Spring Data JPA;
- A troca de dados via DTOs;
- A ordenação e manipulação de entidades em listas;
- A configuração de perfis de ambiente (dev, test, prod).

## 🗂️ Estrutura de Pacotes

```
└── br.com.javadeveloper.dslist
    ├── config         # Configurações globais (ex: CORS)
    ├── controllers    # Camada de controle (exposição da API REST)
    ├── dto            # Objetos de transferência de dados (Data Transfer Object)
    ├── entities       # Entidades JPA mapeadas no banco
    ├── projections    # Projeções para consultas customizadas no JPA
    ├── repositories   # Interfaces do Spring Data JPA
    └── service        # Camada de serviço (regras de negócio)
```

## 🔧 Tecnologias e Ferramentas

- **Java 21**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database (para dev e testes)**
- **Maven**
- **REST**
- **Postman / HTTP Client do IntelliJ para testes**

## 🚀 Como executar o projeto

Certifique-se de que você tem Java 21 e Maven instalados.

```bash
git clone https://github.com/AntonioJavaDeveloper/game-list-api.git
cd game-list-api
./mvnw spring-boot:run
```

A aplicação será iniciada na porta `9001`. Você pode alterar essa configuração no arquivo `application.properties`.

## 📌 Endpoints principais

| Método | Caminho                  | Descrição                          |
|--------|--------------------------|------------------------------------|
| GET    | `/games`                 | Lista todos os jogos               |
| GET    | `/games/{id}`            | Retorna detalhes de um jogo        |
| GET    | `/lists`                 | Lista todas as listas de jogos     |
| GET    | `/lists/{listId}/games` | Lista os jogos de uma lista        |
| POST   | `/lists/{listId}/replacement` | Troca a posição de dois jogos |

> Testes podem ser realizados com o arquivo `test.http` no IntelliJ.

## 🧪 Perfis de Ambiente

- `application-dev.properties`: perfil de desenvolvimento
- `application-test.properties`: perfil de testes
- `application-prod.properties`: perfil de produção (simulado)

Você pode alternar entre perfis com o parâmetro:
```bash
-Dspring.profiles.active=dev
```

## 📝 Considerações Finais

Este projeto não tem o objetivo de ser uma aplicação completa de mercado. Em vez disso, foi concebido como **referência rápida para desenvolvedores iniciantes ou em transição para o back-end com Java e Spring Boot**.

Aqui você encontrará exemplos claros e diretos do que compõe uma API RESTful moderna, com uma estrutura preparada para crescer com segurança e legibilidade.

---

## Contato

Caso deseje entrar em contato para oportunidades ou dúvidas:

- 🌐 [https://javadeveloper.com.br/](https://javadeveloper.com.br/)
- 💼 [LinkedIn](https://www.linkedin.com/in/antonio-javadeveloper/)
- 📧 antonio@javadeveloper.com.br

> Developed by [AntonioJavaDeveloper](https://github.com/AntonioJavaDeveloper)