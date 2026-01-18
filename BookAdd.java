package com.syntecxhub.library.model;
import java.util.*;

public class BookAdd {

	    public static void addBook(List<Book> books, Scanner sc) {
	        System.out.print("Enter Book ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        // Avoid duplicate ID
	        for (Book b : books) {
	            if (b.id == id) {
	                System.out.println("Duplicate ID! Book not added.");
	                return;
	            }
	        }

	        System.out.print("Enter Title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter Author: ");
	        String author = sc.nextLine();

	        books.add(new Book(id, title, author));
	        System.out.println("Book Added Successfully!");
	    }
	}

