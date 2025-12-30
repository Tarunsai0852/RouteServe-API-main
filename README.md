# FoodDeliveryApp

## Prerequisites

- Java 1.8+ (must match `<java.version>` in `pom.xml`)
- Maven (install from https://maven.apache.org/install.html, add its `bin` folder to `PATH`, then verify with `mvn -v`)
- PostgreSQL running locally with a `capgemini` database (or rename in `src/main/resources/application.properties`) plus a `postgres`/`admin` user so the datasource can connect

## Running the application

1. From the project root, regenerate the Maven wrapper (requires Maven on `PATH`):  
   `mvn -N io.takari:maven:wrapper`
2. Start the Spring Boot app via the wrapper (Windows PowerShell):  
   `.\mvnw.cmd spring-boot:run`
   (Alternatively skip the wrapper and use `mvn spring-boot:run` directly once Maven is installed.)
3. By default the server listens on `http://localhost:8080/` (see `src/main/resources/application.properties`) and logs SQL thanks to `spring.jpa.show-sql` being enabled.

## Verification

- Ensure PostgreSQL is reachable before launching, otherwise the Spring context will fail to start.
- Hit the controller endpoints you need (e.g., `http://localhost:8080/restaurant`) to confirm the REST API is up.
