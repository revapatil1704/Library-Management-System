package com.syntecxhub.library.model;
import java.util.*;
class BookUpdate {
	    public static void updateBook(List<Book> books, Scanner sc) {
	        System.out.print("Enter Book ID to Update: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        for (Book b : books) {
	            if (b.id == id) {
	                System.out.print("New Title: ");
	                b.title = sc.nextLine();

	                System.out.print("New Author: ");
	                b.author = sc.nextLine();

	                System.out.println("Book Updated!");
	                return;
	            }
	        }
	        System.out.println("Book Not Found!");
	    }
	}
