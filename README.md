# Product Management System

## Overview

The **Product Management System** is a console-based Java application developed using **Hibernate ORM** for performing CRUD (Create, Read, Update, Delete) operations on product data stored in a relational database.

This project demonstrates:

* Object Relational Mapping (ORM) using Hibernate
* Layered architecture (Entity, DAO, Utility, Main)
* Transaction management
* Database interaction using HQL
* Proper exception handling

The system allows users to manage product records efficiently through a menu-driven interface.

---

## Technology Stack

* **Java**
* **Hibernate ORM (6.x)**
* **JPA Annotations**
* **Oracle / MySQL (configurable)**
* **Maven (Dependency Management)**

---

### Layer Description

* **Entity Layer**
  Defines the `Product` class mapped to the database table using JPA annotations.

* **DAO Layer**
  Handles database operations such as save, update, delete, and retrieve using Hibernate sessions.

* **Utility Layer**
  Manages Hibernate SessionFactory configuration and initialization.

* **Main Layer**
  Provides a console-based user interface for interacting with the system.

---

## Database Schema

### Table: `products`

| Column   | Type    | Constraints                 |
| -------- | ------- | --------------------------- |
| id       | int     | Primary Key, Auto Generated |
| name     | varchar | Not Null                    |
| price    | double  | Not Null                    |
| quantity | int     | Not Null                    |

---

## Functional Operations

### 1. Add Product

Allows the user to insert a new product into the database.

**Input:**

* Product Name
* Product Price
* Product Quantity

**Process:**

* Opens Hibernate session
* Begins transaction
* Saves entity
* Commits transaction

---

### 2. View Products

Displays all available products stored in the database.

**Implementation:**

* Uses HQL query:

  ```
  from Product
  ```
* Returns a list of Product objects.

---

### 3. Update Product

Updates existing product details based on Product ID.

**Input:**

* Product ID
* New Name
* New Price
* New Quantity

**Process:**

* Fetches product by ID
* Updates fields
* Commits transaction

---

### 4. Delete Product

Deletes a product record using Product ID.

**Process:**

* Retrieves product using `session.get()`
* Deletes entity if found
* Commits transaction

---

## Key Features

* Hibernate Session Management
* Transaction Handling with Rollback Support
* Clean Layered Architecture
* Auto-generated Primary Key
* Exception Handling
* Console-based Menu System

---

## Learning Outcomes

This project helps in understanding:

* Hibernate Configuration
* JPA Entity Mapping
* HQL Queries
* Transaction Management
* CRUD Implementation using ORM
* Clean Project Structuring

---

## Future Enhancements

* Add validation for user inputs
* Implement logging framework (SLF4J binding)
* Add pagination for product listing
* Convert console app into Spring Boot REST API
* Implement unit testing

---

## Output

<img width="947" height="492" alt="p3" src="https://github.com/user-attachments/assets/a5aec93c-a705-4d91-82bd-f68eb3cdf0e5" />

<img width="936" height="525" alt="p4" src="https://github.com/user-attachments/assets/ec701c39-08f4-4bc8-80a9-bcff10828c20" />

