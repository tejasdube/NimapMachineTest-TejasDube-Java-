# Machine Test - Tejas Dube

This project is a Spring Boot application designed to manage products and their categories. It demonstrates the implementation of CRUD operations and the handling of relationships between entities using Spring Data JPA and Hibernate.

## Project Description

The application consists of two main entities: `Product` and `Category`. Each product belongs to a category, establishing a many-to-one relationship between products and categories. The project is built using Spring Boot and follows a typical layered architecture with controllers, services, and repositories.

### Key Features

- **Entity Management:** The application allows for the creation, retrieval, updating, and deletion of products and categories.
- **RESTful APIs:** Provides RESTful endpoints for managing products and categories.
- **Database Interaction:** Utilizes Spring Data JPA for seamless interaction with the database, managing entity relationships, and executing queries.
- **Error Handling:** Implements basic error handling and validation for API requests.

### Technologies Used

- **Spring Boot:** Framework for building production-ready applications.
- **Spring Data JPA:** Abstraction over JPA to interact with relational databases.
- **Hibernate:** ORM tool for mapping Java objects to relational database tables.

- **Maven:** Build tools for managing project dependencies and build lifecycle.

### Getting Started

To get started with the project, you need to have Java 17 or higher and Maven or Gradle installed on your machine. Clone the repository, build the project, and run the application using your preferred IDE or command line.

### Running the Application

1. **Clone the Repository:**
   ```bash
   git clone <repository-url>
   cd MachineTest_TejasDube
