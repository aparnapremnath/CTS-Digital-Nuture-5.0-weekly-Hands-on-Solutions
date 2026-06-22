# Exercise 05 - Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)
- JSR 338 Specification for persisting, reading and managing data from Java objects
- Does not contain concrete implementation — it is just a specification
- Hibernate is one of the implementations of JPA

## Hibernate
- ORM Tool that implements JPA
- Requires manual session, transaction, and exception handling

## Spring Data JPA
- Does not have its own JPA implementation
- Another level of abstraction over JPA providers like Hibernate
- Reduces boilerplate code significantly
- Manages transactions automatically

## Comparison

| Feature | Hibernate | Spring Data JPA |
|---------|-----------|-----------------|
| Transaction Management | Manual | Automatic (@Transactional) |
| Boilerplate Code | High | Minimal |
| Session Handling | Manual | Handled internally |
| Repository | Manual DAO | Extends JpaRepository |