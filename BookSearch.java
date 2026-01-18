package com.syntecxhub.library.model;
import java.util.*;
	public class BookSearch {
	    public static void searchBook(List<Book> books, Scanner sc) {
	        System.out.print("Enter ID or Title to search: ");
	        String key = sc.nextLine();

	        for (Book b : books) {
	            if (String.valueOf(b.id).equals(key) || b.title.equalsIgnoreCase(key)) {
	                System.out.println("Book Found: " + b);
	                return;
	            }
	        }
	        System.out.println("Book Not Found!");
	    }
	}

