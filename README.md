#Bookstore REST API
The Bookstore REST API provides endpoints for managing books in a bookstore.

##Getting Started
To use the Bookstore REST API, you need to have the following installed on your system:

Java 17 or later
Apache Maven 3.6 or later
PostgreSQL 9.6 or later
###Clone the repository
First, clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/bookstore.git
```
###Set up the database
Create a new database in PostgreSQL with the following settings:

Host: localhost
Port: 5432
Database name: CT_ETL
Username: postgres
Password: toor

###Build and run the application
Navigate to the root directory of the repository and run the following command to build the application:

```bash
mvn clean package
```
Once the build is complete, run the following command to start the application:

```bash
java -jar target/bookstore-0.0.1-SNAPSHOT.war
```
The application will start running on port 8080.

###Testing the API
To test the API, you can use a tool like Postman or curl.

List all books
```bash
curl -X GET http://localhost:8080/books
```
Get a specific book by ID
```bash
curl -X GET http://localhost:8080/books/{id}
```
Add a new book
```json
curl -X POST -H "Content-Type: application/json" -d '{"title": "Book Title", "description": "Book Description", "author": "Book Author", "genre": "Book Genre", "format": "Book Format", "volumes": 1}' http://localhost:8080/books
```
Update an existing book
```json
curl -X PUT -H "Content-Type: application/json" -d '{"title": "Updated Book Title", "description": "Updated Book Description", "author": "Updated Book Author", "genre": "Updated Book Genre", "format": "Updated Book Format", "volumes": 2}' http://localhost:8080/books/{id}
```
Delete a book
```bash
curl -X DELETE http://localhost:8080/books/{id}
```
###API Documentation
API documentation is available using Swagger at the following URL:

```bash
http://localhost:8080/swagger-ui/
```
