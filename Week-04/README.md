# Week 4 - 01) Account and Loan Microservices

## Overview
This exercise demonstrates splitting a single application into two independent Spring Boot microservices for a bank: one for handling **accounts** and one for handling **loans**. Each service is a standalone Maven project with its own `pom.xml`, and neither has any backend/database connectivity — both return static dummy data.

## Project Structure
```
01)AccountAndLoanMicroservices/
├── account/     # Account microservice (Spring Boot, port 8080)
└── loan/        # Loan microservice (Spring Boot, port 8081)
```

## Account Microservice
- **Group:** com.cognizant
- **Artifact:** account
- **Dependencies:** Spring Web, Spring Boot DevTools
- **Endpoint:** `GET /accounts/{number}`
- **Sample Response:**
  ```json
  {
    "number": "00987987973432",
    "type": "savings",
    "balance": 234343
  }
  ```
- **Run:** `mvn spring-boot:run` (starts on default port 8080)
- **Test:** `curl http://localhost:8080/accounts/00987987973432`

## Loan Microservice
- **Group:** com.cognizant
- **Artifact:** loan
- **Dependencies:** Spring Web, Spring Boot DevTools
- **Endpoint:** `GET /loans/{number}`
- **Sample Response:**
  ```json
  {
    "number": "H00987987972342",
    "type": "car",
    "loan": 400000,
    "emi": 3258,
    "tenure": 18
  }
  ```
- **Run:** `mvn spring-boot:run`
- **Test:** `curl http://localhost:8081/loans/H00987987972342`

## Key Learning: Port Conflicts
Running both services simultaneously with default settings causes the second one to fail:
```
Web server failed to start. Port 8080 was already in use.
```
This happens because every Spring Boot application defaults to port **8080**. Since the account service is already bound to it, the loan service cannot start on the same port.

**Fix:** Add the following property to the loan service's `src/main/resources/application.properties`:
```properties
server.port=8081
```
After this change, both services can run concurrently — account on 8080, loan on 8081.

## How to Run Both Services
1. Open a terminal in the `account` folder and run `mvn spring-boot:run`
2. Open a second terminal in the `loan` folder and run `mvn spring-boot:run`
3. Verify both are up:
   - `curl http://localhost:8080/accounts/00987987973432`
   - `curl http://localhost:8081/loans/H00987987972342`
