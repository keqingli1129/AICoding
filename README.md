# Task Management REST API

A Spring Boot application that provides REST API endpoints for managing tasks. This application allows users to create, read, update, and delete tasks through HTTP endpoints.

## Technologies Used

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- H2 Database
- Lombok
- SpringDoc OpenAPI (Swagger UI)
- Maven
- JUnit 5 & Mockito for testing

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/taskmanagement/
│   │       ├── controller/        # REST controllers
│   │       ├── model/            # Entity classes
│   │       ├── repository/       # Data access layer
│   │       ├── service/          # Business logic layer
│   │       └── exception/        # Custom exceptions
│   └── resources/
│       └── application.properties # Application configuration
└── test/
    └── java/                     # Test classes
```

## Components

### Models
- `Task`: Entity class representing a task with properties like id, title, description, and completion status.

### Controllers
- `TaskController`: REST controller handling HTTP requests for task operations.

### Services
- `TaskService`: Interface defining task management operations.
- `TaskServiceImpl`: Implementation of TaskService interface with business logic.

### Repositories
- `TaskRepository`: JPA repository for Task entity persistence.

### Exception Handling
- `TaskNotFoundException`: Custom exception for missing tasks.
- `GlobalExceptionHandler`: Central exception handler for the application.

## API Endpoints

- GET `/api/tasks` - Get all tasks
- GET `/api/tasks/{id}` - Get a specific task by ID
- POST `/api/tasks` - Create a new task
- PUT `/api/tasks/{id}` - Update an existing task
- DELETE `/api/tasks/{id}` - Delete a task

## Building and Running

### Prerequisites
- Java 17 or higher
- Maven

### Build
```bash
mvn clean install
```

### Run
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### API Documentation
Access the Swagger UI documentation at:
- `http://localhost:8080/swagger-ui.html`

Access the OpenAPI specification at:
- `http://localhost:8080/api-docs`

### Database
The application uses H2 in-memory database.
Access the H2 console at:
- `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:taskdb`
- Username: `sa`
- Password: ` ` (empty)

## Testing

Run the tests using:
```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
