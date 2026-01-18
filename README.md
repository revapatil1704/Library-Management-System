# Library-Management-System
A simple Java-based Book Management System developed using Eclipse.  It allows users to add, view, search, update, and delete book records using a console-based interface.It is modular and oragnized into separate classes for easy understanding and internship submission.
Project Modules / Files
1. Book.java
Represents a Book entity
Stores book details: ID, Title, Author
2. BookAdd.java
Handles adding new books to the system
Takes user input and creates new Book objects
3. BookUpdate.java
Handles updating existing book details
Allows editing of Title and Author using Book ID
4. BookDelete.java
Handles deletion of books from records
Removes book using Book ID
5. BookDisplay.java
Displays all available books
Shows book list in console
6. BookSearch.java
Searches books by ID or Title
Displays book details if found
7. BookStorage.java
Handles storing and loading book data
Manages file/database operations for data persistence
8. MainApp.java
Main entry point of the project
Provides menu-driven console interface
Connects all modules together

 #Features
Add new Book records
Display all available Books
Search Book by ID or Title
Update Book information
Delete Book records
Data storage for saving book details
Menu-driven console interface
Prevents duplicate Book IDs
Handles invalid user inputs
