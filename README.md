# Address Book Spring Project

This project is a Spring Boot-based Address Book application that serves REST requests for an existing Address Book UI. The backend replaces JSONServer with Spring Boot and MySQL as the database.

## Project Structure

The project follows a structured Git branching strategy:

- `main` - The main branch containing the stable production-ready code.
- `default` - Base branch for development.
- `UC1-addressBookAppSetup` - Initial setup of the Address Book application.
- `UC2-httpsmethodsimplement` - Implementation of basic HTTP methods for CRUD operations.
- `UC3-dto` - Data Transfer Object (DTO) implementation.
- `UC4-servicelayer` - Service layer implementation for business logic.
- `UC5-securepassword` - Password encryption for security.
- `UC6 - User Registration and Login` - Register new users with validation and Login functionality with JWT token generation.
- `UC7 - Forgot and Reset Password` - Send a reset password link via email and Validate token and reset user password securely.
- `UC8 - Swagger UI Integration` - Integrated **Swagger UI** for API documentation. Provides real-time documentation and API testing.
- `UC9 - Sending Emails` - Email service configured using **JavaMailSender**. SMTP configuration with `MailConfig.java`. Sends notifications and password reset links.
- `UC10 - Redis for Authentication` - Implemented Redis for token caching. Improves authentication efficiency by reducing DB hits. Manages session tokens securely with expiration.
- `UC11 - RabbitMQ Integration` - Integrated RabbitMQ for asynchronous message processing. Queue management for handling heavy traffic scenarios. Improves system scalability and decoupling.

## Setup Instructions

1. **Clone the repository**  
   ```sh
   git clone <repository-url>
   cd address-book-spring
