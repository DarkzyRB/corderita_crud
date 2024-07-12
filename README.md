## Example CRUD Project Repository for Corderita

This repository contains a basic CRUD API project developed in Java using Spring Framework version 3.3.1. The purpose of this project is solely for demonstration and educational purposes, created specifically for my friend Corderita.

### Project Overview

This project includes a simple CRUD (Create, Read, Update, Delete) API that interacts with a database to perform basic operations. It's designed to provide a clear and straightforward example of how to set up and work with a CRUD application using Spring.

### Technologies Used

- **Java**
- **Spring Framework 3.3.1**
- **Maven** (for project management and build)

### Features

- Create new entries
- Read existing entries
- Update existing entries
- Delete entries

### Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/DarkzyRB/corderita_crud.git
    ```
2. Navigate to the project directory:
    ```bash
   cd corderita_crud
    ```
3. Build the project using Maven:
    ```bash
   mvn clean install
    ```
4. Run the application:
    ```bash
   mvn spring-boot:run
    ```

### Usage
Once the application is running, you can interact with the API using any API client (e.g., Postman) or command-line tools (e.g., curl).

### Endpoints
* POST /api/v1/user - Create a new item
* GET /api/v1/user - Retrieve all items
* GET /api/v1/user/{id} - Retrieve an item by ID
* PUT /api/v1/user - Update an item by ID
* DELETE /api/v1/user/{id} - Delete an item by ID

### Acknowledgments
This project was created as a simple example for educational purposes and as a personal project for my friend Corderita. Feel free to use it as a reference for your own learning and development.