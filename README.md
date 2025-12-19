Spring Boot JDBC CRUD Application
Overview

This is a Spring Boot RESTful CRUD application built using Spring JDBC with an H2 in-memory database. The application follows a layered architecture with Controller → Service → Repository pattern.

Features

Create, Read, Update, Delete (CRUD) operations for managing data

Built using Spring Boot and Spring JDBC

H2 in-memory database for easy testing and development

RESTful APIs using @RestController and HTTP methods:

GET – Fetch data

POST – Add data

PUT – Update data

DELETE – Remove data

Layered architecture:

Controller – Handles HTTP requests

Service – Contains business logic

Repository/DAO – Handles database operations using JdbcTemplate

Uses Maven as the build tool for dependency management

Technologies Used

Java 17 (JDK version)

Spring Boot

Spring JDBC

H2 Database

Maven

Annotations used: @SpringBootApplication, @RestController, @Service, @Repository, @Autowired, @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
