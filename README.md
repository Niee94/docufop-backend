# DocuFOP Backend

Java Spring Boot backend for PDF document generation and basic document management for individual entrepreneurs.

## How to Run

1. Ensure Java 17 and Maven are installed.
2. Configure PostgreSQL in `src/main/resources/application.yml`.
3. Build the project:
   ```
   mvn clean package
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
5. Access Swagger UI at `http://localhost:8080/swagger-ui/index.html`.
