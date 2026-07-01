# Week 03 Solutions

## 📝 Overview
This folder contains solutions for Week 03 assignments covering Spring Boot REST services, Spring Core XML configuration, and JWT Authentication using Spring Security.

## 📂 Exercises

| Folder | Exercise | Description |
|--------|----------|-------------|
| `01)SpringWebProject` | Spring Web Project | Created a Spring Boot Maven project using Spring Initializr with Spring Web and DevTools dependencies. Verified startup logs via SLF4J. |
| `02)SpringCoreCountry` | Spring Core – Load Country from XML | Configured a `Country` bean in `country.xml` and loaded it using `ClassPathXmlApplicationContext`. Demonstrated Spring IoC – constructor invocation followed by setter injection. |
| `03)HelloWorldREST` | Hello World RESTful Web Service | Built a `@RestController` with a `GET /hello` endpoint returning `"Hello World!!"`. Tested via browser and Postman; compared HTTP headers across both clients. |
| `04)CountryRESTService` | REST – Country Web Service | Created `GET /country` endpoint returning India's details as JSON. Jackson auto-serializes the `Country` bean via getter methods. Verified `Content-Type: application/json` in DevTools and Postman. |
| `05)CountryByCode` | REST – Get Country by Code | Implemented `GET /countries/{code}` with case-insensitive lookup using Java 8 Streams and lambda expressions. All four countries (US, DE, IN, JP) configured in `country.xml` as a `<util:list>`. |
| `06)JwtAuthenticationService` | JWT Authentication Service | Secured endpoints using Spring Security 6 (`SecurityFilterChain`). `GET /authenticate` decodes Basic Auth header, extracts username, and returns a signed JWT using jjwt 0.9.0. Added `jaxb-api` for JDK 17+ compatibility. |

## 🔍 Notes
- Spring Boot version used: **3.5.16**
- Port: `8083` for exercises 1–5, `8090` for exercise 6 (JWT)
- Spring Security 6 removes `WebSecurityConfigurerAdapter` — replaced with `SecurityFilterChain` bean approach
- jjwt 0.9.0 requires `javax.xml.bind:jaxb-api:2.3.1` as an extra dependency on JDK 11+
- Debug logging enabled via `logging.level.com.cognizant.springlearn=DEBUG` in `application.properties`
