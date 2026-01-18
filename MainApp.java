package com.syntecxhub.library.model;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = BookStorage.loadBooks();

        while (true) {
            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> BookAdd.addBook(books, sc);
                case 2 -> BookSearch.searchBook(books, sc);
                case 3 -> BookUpdate.updateBook(books, sc);
                case 4 -> BookDelete.deleteBook(books, sc);
                case 5 -> BookDisplay.displayBooks(books);
                case 6 -> {
                    BookStorage.saveBooks(books);
                    System.out.println("Data Saved. Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}

