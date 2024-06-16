# Library Management System

A simple library management system implemented in Java. This system allows users to manage books and members, borrow and return books, and view borrowed books.

## Features

- **Add Book:** Add new books to the library system.
- **Add Member:** Register new members to the library system.
- **Borrow Book:** Allow members to borrow books from the library.
- **Return Book:** Enable members to return borrowed books.
- **List Borrowed Books:** Display the list of books borrowed by a specific member.
- **Exit:** Exit the library management system.

## Classes

### Book.java

Represents a book with attributes such as ID, title, author, category, and borrowed status. Provides methods to manage book details and borrowed status.

### Member.java

Represents a library member with attributes such as member ID, name, and a list of borrowed books. Provides methods to manage borrowed books and member details.

### LibrarySystem.java

Main class that implements the library management system. Provides a menu-driven interface for interacting with books and members. Uses HashMaps to store books and members, and Scanner for user input.
