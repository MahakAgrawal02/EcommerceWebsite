# E-commerce Website API

A Spring Boot-based REST API for an e-commerce website that manages products and categories.

## Technologies Used

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- MySQL
- Maven
- Lombok

## Prerequisites

- Java 21 or higher
- MySQL Server
- Maven

## Database Configuration

The application uses MySQL as its database. Configure your database connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecomDb
spring.datasource.username=root
spring.datasource.password=your_password
```

## API Endpoints

### Categories

#### Get All Categories
- **URL**: `/categories`
- **Method**: GET
- **Description**: Retrieves all available product categories
- **Response**: List of categories with their associated products

### Products

#### Get All Products
- **URL**: `/products`
- **Method**: GET
- **Description**: Retrieves all available products
- **Response**: List of products with their category information

#### Get Products by Category
- **URL**: `/products/category/{categoryId}`
- **Method**: GET
- **Description**: Retrieves all products belonging to a specific category
- **Parameters**: 
  - `categoryId` (path parameter): ID of the category
- **Response**: List of products in the specified category

## Data Models

### Category
```json
{
    "id": "Long",
    "name": "String",
    "products": "List<Product>"
}
```

### Product
```json
{
    "id": "Long",
    "name": "String",
    "description": "String",
    "imageUrl": "String",
    "price": "Double",
    "category": "Category"
}
```

## Running the Application

1. Clone the repository
2. Configure the database connection in `application.properties`
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
4. The application will start on port 8081

## Initial Data

The application includes a data seeder that populates the database with initial categories and products:
- Categories: Electronics, Clothing, Home and Kitchen
- Sample products in each category

## Project Structure

```
src/main/java/com/ecom/
├── config/          # Configuration classes
├── controller/      # REST controllers
├── model/          # Entity classes
├── repositories/   # JPA repositories
└── service/        # Business logic
``` 