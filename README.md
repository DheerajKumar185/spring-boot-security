# spring-boot-security
Spring Boot Security Integrations
  # spring-boot-jwt - Spring Boot JWT Authentication Example
  A simple Spring Boot application demonstrating **JWT (JSON Web Token) authentication** with secure and public REST APIs.
  
  ## 📌 Features
- Spring Boot 3.5.4 (compatible with Java 17)
- JWT-based authentication and authorization
- Secure and public API endpoints
- Token generation and validation
- Simple in-memory user authentication
- Configuration via application.yml

  ## 🛠 Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring Security**
- **JWT (jwt.io)**
- **Maven**

  ### 1️⃣ Prerequisites
- Java 17+
- Maven 3.8+
- IDE (IntelliJ, Eclipse)

  ### 2️⃣ API Endpoints
1. curl --location 'localhost:8080/auth/login' \
--header 'Content-Type: application/json' \
--data '{
    "username": "user",
    "password": "pass"
}'
**Response:**
{
  "token": "<your_jwt_token>"
}

2. curl --location 'localhost:8080/api/hello'
3. curl --location 'localhost:8080/secure/employee' \
--header 'Authorization: Bearer <your_jwt_token>'
