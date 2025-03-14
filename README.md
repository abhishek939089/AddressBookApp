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

## Features

- REST API for managing address book entries.
- Spring Boot backend with MySQL database.
- DTO implementation for structured data transfer.
- Service layer for business logic handling.
- Secure password storage and authentication.

## Setup Instructions

1. **Clone the repository**  
   ```sh
   git clone <repository-url>
   cd address-book-spring
