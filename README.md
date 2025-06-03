# 📚 Game List API

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)

This project is a REST API built with **Spring Boot 3** and **Java 21**, mainly aimed at demonstrating the **fundamentals of REST architecture** within the Spring ecosystem. It was structured to serve as a reference for **best practices in code organization** and as an example of using the main **Spring Framework annotations**.

Now the project fully supports **Docker**, making it easy to run and deploy in any environment. The Java service image is built using a **multi-stage build**, ensuring that the final container is as lightweight as possible — containing only what is necessary to run the application, without Maven and build tools.

---

## 🎯 Purpose

The **Game List API** project simulates a list of games and their positions in rankings. Although it's a simple application, the goal is to clearly and practically demonstrate:

- Layered architecture (controller, service, repository, DTO, etc.);
- Basic Spring Boot configuration;
- Use of annotations such as `@RestController`, `@Service`, `@Repository`, `@Entity`, `@Transactional`, `@Autowired`, etc.;
- Creation of interface-based projections with Spring Data JPA;
- Data exchange via DTOs;
- Sorting and handling of entities in lists;
- Environment profile configuration (dev, test, prod).

---

## 🐳 Running with Docker (Recommended)

The project is ready to run using Docker and Docker Compose.

### Prerequisites:

* Docker
* Docker Compose

### How to start the services:

```bash
git clone https://github.com/AntonioJavaDeveloper/game-list-api.git
cd game-list-api
cp .env.txt .env  # Creates the .env file with the required environment variables
docker-compose up --build
```

The application will start on the port defined by the `JAVA_SERVER_PORT` variable in the `.env` file.  
If not defined, it defaults to port `9000`.

Available services:

* `games-app`: Java application
* `dev-postgresql`: Postgres 15 database
* `dev-pgadmin`: Web interface for database access (port `5050`)

> The **multi-stage build** in the Dockerfile reduces the final backend image size by separating the build phase (with Maven) from the runtime phase (with a lightweight JDK based on Alpine).

---

## 🗂️ Package Structure

```
└── br.com.javadeveloper.dslist
    ├── config         # Global configurations (e.g., CORS)
    ├── controllers    # REST API exposure
    ├── dto            # Data Transfer Objects
    ├── entities       # JPA entities mapped to the database
    ├── projections    # Custom JPA projections
    ├── repositories   # Spring Data JPA interfaces
    └── service        # Business logic layer
```

---

## 🔧 Technologies and Tools

* **Java 21**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **H2 Database (for dev and tests)**
* **PostgreSQL (for Docker environments)**
* **Maven**
* **REST**
* **Docker + Docker Compose**
* **PgAdmin (browser-based DB admin tool)**
* **Postman / IntelliJ HTTP Client for testing**

---

## 🚀 Running the project manually (without Docker)

Make sure you have Java 21 and Maven installed.

```bash
git clone https://github.com/AntonioJavaDeveloper/game-list-api.git
cd game-list-api
./mvn spring-boot:run
```

The application will start on the port defined by the `JAVA_SERVER_PORT` environment variable, if it has been previously exported.  
If not, it will default to port `9000`, as defined in `application.properties`:

```properties
server.port=${JAVA_SERVER_PORT:9000}
```

> ⚠️ Spring Boot **does not automatically read the `.env` file**. To make the `JAVA_SERVER_PORT` variable effective outside Docker, you need to export it manually in the terminal or configure it in your IDE.

---

## 📌 Main Endpoints

| Method | Path                         | Description                          |
|--------|------------------------------|--------------------------------------|
| GET    | `/games`                     | List all games                       |
| GET    | `/games/{id}`                | Get game details                     |
| GET    | `/lists`                     | List all game lists                  |
| GET    | `/lists/{listId}/games`      | List games within a specific list    |
| POST   | `/lists/{listId}/replacement`| Swap the position of two games       |

> Tests can be performed using the `test.http` file in IntelliJ.

---

## 🧪 Environment Profiles

- `application-dev.properties`: development profile
- `application-test.properties`: test profile
- `application-prod.properties`: simulated production profile

You can switch between profiles using:

```bash
-Dspring.profiles.active=dev
```

---

## 📝 Final Notes

This project is not intended to be a complete market-level application. Instead, it was designed as a **quick reference for beginner developers or those transitioning to backend with Java and Spring Boot**.

Here you will find clear and straightforward examples of what makes up a modern RESTful API, with a structure ready to grow with safety and readability.

---

## Contact

If you'd like to get in touch for opportunities or questions:

- 🌐 [https://javadeveloper.com.br/](https://javadeveloper.com.br/)
- 💼 [LinkedIn](https://www.linkedin.com/in/antonio-javadeveloper/)
- 📧 antonio@javadeveloper.com.br

> Developed by [AntonioJavaDeveloper](https://github.com/AntonioJavaDeveloper)
