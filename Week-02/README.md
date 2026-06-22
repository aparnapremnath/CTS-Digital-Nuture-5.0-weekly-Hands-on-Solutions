# Week 02 Solutions

## 📝 Overview
This folder contains solutions for Week 02 assignments covering Spring Core, Dependency Injection, Bean Configuration, and Spring Data JPA.

## 📂 Files

| Exercise | Folder | Description |
|----------|--------|-------------|
| 01 | 01)LibraryManagement | Configuring a Basic Spring Application using XML-based bean configuration |
| 02 | 02)ImplementingDependencyInjection | Implementing Dependency Injection using Spring IoC and setter injection |
| 03 | 03)MavenProject | Maven project structure and build lifecycle |
| 04 | 04)SpringDataJPA | Spring Data JPA Quick Example - fetching country data from MySQL using JpaRepository |
| 05 | 05)JPA-Hibernate-SpringDataJPA | Theory - Differences between JPA, Hibernate, and Spring Data JPA |

## 🔧 Tech Stack
- Java 17
- Spring Core 5.3.31
- Spring Boot 3.5.15
- Spring Data JPA
- Hibernate
- MySQL 8.0.46
- Maven

## 🔍 Notes
- XML-based bean configuration using `applicationContext.xml`
- Setter Injection used to wire `BookRepository` into `BookService`
- Spring `ClassPathXmlApplicationContext` used to load the application context
- Spring Data JPA uses `JpaRepository` to eliminate boilerplate DAO code
- MySQL `ormlearn` schema used for Exercise 04
