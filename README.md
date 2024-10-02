# Bank Account Management System

## Overview
This project is a simple bank account management system built using Java and Spring Boot. It allows users to create bank accounts, log in, and perform operations such as deposits and withdrawals.

## Features
- Create a new bank account
- Log in to an existing account
- Perform deposits and withdrawals
- View account details

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites
- Java 22 or higher
- Maven

### Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/bank-account-management.git
    ```
2. Navigate to the project directory:
    ```sh
    cd bank-account-management
    ```
3. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage
1. Follow the prompts in the console to create a new account or log in to an existing account.
2. Perform operations such as deposits and withdrawals as needed.

## Project Structure
- `src/main/java/org/franco/entities`: Contains the `BankAccount` entity class.
- `src/main/java/org/franco/repository`: Contains the `BankAccountRepository` interface.
- `src/main/java/org/franco/service`: Contains the `BankAccountService` class.
- `src/main/java/org/franco/controller`: Contains the `BankAccountController` class.
- `src/main/java/org/franco`: Contains the `Main` class to run the application.

## Author
Lucas Franco
