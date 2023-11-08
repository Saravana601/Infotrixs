# Random Quotes Generator

The Random Quotes Generator is a Spring Boot application that provides RESTful APIs for generating, managing, and retrieving random quotes. It allows you to add quotes, retrieve random quotes, retrieve quotes by author, update quotes, and delete quotes.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Built With](#built-with)

## Introduction

This program offers a set of APIs for managing and retrieving random quotes. It uses a simple database to store and retrieve quotes, and it also provides the ability to generate a random quote from the available quotes.

## Features

- Add a new quote.
- Add multiple quotes at once.
- Get a random quote.
- Get quotes by author.
- Update an existing quote.
- Delete a quote.

## Getting Started

To run the Random Quotes Generator program, you need a Java Development Kit (JDK) installed on your machine. You can follow these steps to get started:

1. Clone the repository to your local machine.

2. Open your terminal or command prompt and navigate to the project directory.

3. Compile the Java program using the following command:
```
javac RandomQuotesGenerator.java
```
4. Run the program with the following command:
```
java RandomQuotesGenerator
```
5. Once the program is running, you can access the API endpoints via Swagger for testing and interaction. Open your web browser and visit the Swagger UI by navigating to:
```
http://localhost:8080/swagger-ui.html
```
6. You will be presented with a user-friendly interface to interact with the API, allowing you to add quotes, retrieve random quotes, get quotes by author, update quotes, and delete quotes.

7. Use Swagger to perform the desired operations and test the API functionality.

Please note that you can also use other tools like Postman or cURL to interact with the API, but Swagger provides a convenient web-based interface for testing.

## API Endpoints

### Quotes Controller

- `POST /quote`: Add a new quote.
- `POST /quotes`: Add multiple quotes.
- `GET /quote`: Get a random quote.
- `GET /quote/{quoteId}`: Get a quote by its ID.
- `GET /quotes`: Get quotes by author.
- `PUT /quote/Id/{quoteId}`: Update a quote by its ID.
- `DELETE /quote/Id/{quoteId}`: Delete a quote by its ID.

## Built With

- Spring Boot - For building the RESTful API.
- Java - The programming language used for the application logic.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
