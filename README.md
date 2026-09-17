# Library Management System

A simple console-based Library Management System built using Java and Object-Oriented Programming (OOP).

The project allows users to manage books and library users, issue books, return books, and view available books and registered users.

## Features

* Add new books
* Add library users
* Display all books
* Display all registered users
* Issue a book to a user
* Return an issued book
* Check book availability
* Menu-driven console interface
* Uses Java OOP concepts
* Uses separate classes for different responsibilities

## Technologies Used

* Java
* Java Collections Framework
* ArrayList
* Object-Oriented Programming

## Project Structure

```text
LibraryManagementSystem/
│
├── Book.java
├── User.java
├── Library.java
├── Main.java
└── README.md
```

## Class Overview

### Book.java

The `Book` class represents a book in the library.

It stores:

* Book ID
* Book title
* Book author
* Book availability

The class provides methods to:

* Get book details
* Check availability
* Change availability
* Display book information

Example:

```java
Book book=new Book(1,"Clean Code","Robert C. Martin");
```

## User.java

The `User` class represents a library user.

It stores:

* User ID
* User name

Example:

```java
User user=new User(1,"Nikhil");
```

## Library.java

The `Library` class manages the main library operations.

It contains two `ArrayList` collections:

```java
ArrayList<Book> books;
ArrayList<User> users;
```

It provides methods for:

* Adding books
* Adding users
* Displaying books
* Displaying users
* Issuing books
* Returning books
* Finding books
* Finding users

The `Library` class is responsible for the main business logic of the application.

## Main.java

The `Main` class contains the `main()` method and starts the application.

It provides a menu through which the user can interact with the library.

The available options are:

```text
1. Add Book
2. Add User
3. Show Books
4. Show Users
5. Issue Book
6. Return Book
7. Exit
```

## Requirements

Before running the project, make sure Java is installed on your system.

You need:

* Java JDK
* Command Prompt, Terminal, or an IDE

You can check whether Java is installed using:

```bash
java -version
```

You can also check the Java compiler:

```bash
javac -version
```

If both commands return a Java version, your setup is ready.

## Installing Java

If Java is not installed, install a Java Development Kit (JDK).

After installation, verify it using:

```bash
java -version
javac -version
```

## Setup

### 1. Clone the Repository

If the project is available on GitHub, clone it using:

```bash
git clone <repository-url>
```

Move into the project directory:

```bash
cd LibraryManagementSystem
```

If you are not using Git, you can simply download the project and open its folder.

### 2. Check the Files

Make sure the project contains:

```text
Book.java
User.java
Library.java
Main.java
README.md
```

All Java files should be in the same directory.

## Compile the Project

Open a terminal inside the project directory.

Run:

```bash
javac *.java
```

This compiles all Java files in the directory.

If compilation is successful, Java will generate `.class` files:

```text
Book.class
User.class
Library.class
Main.class
```

## Run the Project

After compilation, run:

```bash
java Main
```

You should see:

```text
1. Add Book
2. Add User
3. Show Books
4. Show Users
5. Issue Book
6. Return Book
7. Exit
Enter choice:
```

## Example Usage

### Add a Book

Select:

```text
1
```

Enter:

```text
Enter book ID: 1
Enter title: Clean Code
Enter author: Robert C. Martin
```

Output:

```text
Book added successfully.
```

### Add a User

Select:

```text
2
```

Enter:

```text
Enter user ID: 1
Enter user name: Nikhil
```

Output:

```text
User added successfully.
```

### Show Books

Select:

```text
3
```

Example output:

```text
ID: 1 | Title: Clean Code | Author: Robert C. Martin | Available: true
```

### Show Users

Select:

```text
4
```

Example output:

```text
ID: 1 | Name: Nikhil
```

### Issue a Book

Select:

```text
5
```

Enter:

```text
Enter book ID: 1
Enter user ID: 1
```

Output:

```text
Book issued to Nikhil.
```

The book's availability will now become:

```text
Available: false
```

### Return a Book

Select:

```text
6
```

Enter:

```text
Enter book ID: 1
```

Output:

```text
Book returned successfully.
```

The book will become available again.

## How the System Works

The application follows a simple object-oriented structure.

```text
Main
  |
  v
Library
  |
  +---- Book
  |
  +---- User
```

`Main` handles user input and menu interaction.

`Library` handles library operations.

`Book` represents individual books.

`User` represents individual library users.

When a book is issued, the `Library` finds the requested book and user.

It then checks whether:

1. The book exists.
2. The user exists.
3. The book is currently available.

If all conditions are satisfied, the book's availability changes from:

```text
true
```

to:

```text
false
```

When the book is returned, its availability changes back to:

```text
true
```

## OOP Concepts Used

### Encapsulation

The fields inside the classes are private.

Example:

```java
private int id;
private String title;
private String author;
private boolean available;
```

They are accessed through public methods such as:

```java
getId()
getTitle()
getAuthor()
isAvailable()
```

### Classes and Objects

The project uses separate classes to represent different entities.

For example:

```java
Book book=new Book(1,"Clean Code","Robert C. Martin");
```

Here, `Book` is the class and `book` is the object.

### Constructors

Constructors initialize objects when they are created.

Example:

```java
public Book(int id,String title,String author){
    this.id=id;
    this.title=title;
    this.author=author;
    available=true;
}
```

### ArrayList

The library stores books and users using `ArrayList`.

```java
ArrayList<Book> books;
ArrayList<User> users;
```

This allows multiple books and users to be stored dynamically.

### Methods

Different operations are implemented using methods.

Examples:

```java
addBook()
addUser()
showBooks()
showUsers()
issueBook()
returnBook()
```

This keeps the code organized and separates responsibilities.

## Error Handling

The application handles basic invalid operations.

For example, if a book does not exist:

```text
Book not found.
```

If a user does not exist:

```text
User not found.
```

If a book is already issued:

```text
Book is already issued.
```

If a book is already available when trying to return it:

```text
Book is already in the library.
```

## Limitations

This is a basic console-based project intended for learning Java and OOP.

Currently:

* Data is stored only in memory.
* Data is lost when the application is closed.
* There is no database.
* There is no login or authentication system.
* A book does not store information about which user currently has it.
* There is no due-date or fine calculation.
* There is no graphical user interface.

## Possible Future Improvements

The project can be extended by adding:

* MySQL or PostgreSQL database
* User authentication
* Admin and user roles
* Book search
* Book categories
* Due dates
* Fine calculation
* Borrowing history
* Multiple copies of the same book
* GUI using JavaFX or Swing
* REST API using Spring Boot
* Database persistence using JDBC or JPA
* Input validation
* Exception handling

## Learning Objectives

This project is useful for practicing:

* Java fundamentals
* Classes and objects
* Constructors
* Encapsulation
* Access modifiers
* ArrayList
* Methods
* Loops
* Conditional statements
* Switch statements
* Basic system design
* Separation of responsibilities

## Author

Built as a Java Object-Oriented Programming project.

## License

This project is available for educational and personal use.
