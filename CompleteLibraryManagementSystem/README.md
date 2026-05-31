
# Library Management System

## Overview

This project is a Java-based Library Management System that allows librarians to manage books, patrons, and lending operations efficiently.

## Features

### Book Management

* Add Book
* Update Book
* Delete Book
* Search Book by ISBN
* Search Book by Title
* Search Book by Author

### Patron Management

* Add Patron
* Update Patron
* Delete Patron
* View Borrowing History

### Lending Process

* Checkout Book
* Return Book

### Inventory Management

* Track Available Books
* Track Borrowed Books

## Design Patterns Used

### Factory Pattern

Used to create Book objects through BookFactory.

### Strategy Pattern

Used to implement flexible search mechanisms.

### Observer Pattern

Used to notify patrons about library events and reservations.

## SOLID Principles

* Single Responsibility Principle
* Open/Closed Principle
* Dependency Inversion Principle

## Technologies

* Java 8
* Java Collections Framework
* java.util.logging


## Class Diagram

Book
├── title
├── author
├── isbn
└── publicationYear

Patron
├── id
├── name
├── email
└── borrowingHistory

LibraryService
├── manageBooks()
├── managePatrons()
├── checkoutBook()
└── returnBook()

BookFactory
└── createBook()

SearchStrategy
└── search()

TitleSearch
└── implements SearchStrategy

Observer
└── update()

PatronNotifier
└── implements Observer
