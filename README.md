# 📚 Game List API

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)

This project is a REST API built with **Spring Boot 3** and **Java 21**, designed primarily to **demonstrate the fundamentals of REST architecture** within the Spring ecosystem. It serves as a reference for **best practices in code organization** and usage of key **Spring Framework annotations**.

## 🎯 Purpose

The **Game List API** project simulates a list of games and their rankings. Although it's a simple application, its main goal is to clearly and practically showcase:

- Layered architecture (controller, service, repository, DTO, etc);
- Basic Spring Boot configuration;
- Usage of annotations such as `@RestController`, `@Service`, `@Repository`, `@Entity`, `@Transactional`, `@Autowired`, etc;
- Interface-based projections using Spring Data JPA;
- Data exchange using DTOs;
- Entity ordering and manipulation in lists;
- Environment profile configuration (dev, test, prod).

## 🗂️ Package Structure

```
└── br.com.javadeveloper.dslist
    ├── config         # Global settings (e.g., CORS)
    ├── controllers    # REST API layer
    ├── dto            # Data Transfer Objects
    ├── entities       # JPA entity models
    ├── projections    # Custom JPA query projections
    ├── repositories   # Spring Data JPA interfaces
    └── service        # Business logic layer
```

## 🔧 Technologies and Tools

- **Java 21**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database (for dev and tests)**
- **Maven**
- **REST**
- **Postman / IntelliJ HTTP Client for testing**

## 🚀 How to Run

Make sure you have Java 21 and Maven installed.

```bash
git clone https://github.com/AntonioJavaDeveloper/game-list-api.git
cd game-list-api
./mvnw spring-boot:run
```

The application will start on port `9001`. You can change this in the `application.properties` file.

## 📌 Main Endpoints

| Method | Path                        | Description                         |
|--------|-----------------------------|-------------------------------------|
| GET    | `/games`                    | List all games                      |
| GET    | `/games/{id}`               | Get details of a specific game      |
| GET    | `/lists`                    | List all game lists                 |
| GET    | `/lists/{listId}/games`     | List games from a specific list     |
| POST   | `/lists/{listId}/replacement` | Swap the position of two games    |

> You can test endpoints using the `test.http` file in IntelliJ.

## 🧪 Environment Profiles

- `application-dev.properties`: development profile
- `application-test.properties`: testing profile
- `application-prod.properties`: production profile (simulated)

You can switch profiles using:

```bash
-Dspring.profiles.active=dev
```

## 📝 Final Thoughts

This project is not intended to be a complete production-grade application. Instead, it was designed as a **quick reference for developers who are new or transitioning to Java and Spring Boot for backend development**.

It provides concise, practical examples of what constitutes a modern RESTful API, with a structure ready to grow safely and clearly.

---

## Contact

If you want to get in touch for opportunities or questions:

- 🌐 [https://javadeveloper.com.br/](https://javadeveloper.com.br/)
- 💼 [LinkedIn](https://www.linkedin.com/in/antonio-javadeveloper/)
- 📧 antonio@javadeveloper.com.br

> Developed by [AntonioJavaDeveloper](https://github.com/AntonioJavaDeveloper)