package com.syntecxhub.library.model;
import java.util.*;
public class BookDelete {
	
	    public static void deleteBook(List<Book> books, Scanner sc) {
	        System.out.print("Enter Book ID to Delete: ");
	        int id = sc.nextInt();

	        Iterator<Book> it = books.iterator();
	        while (it.hasNext()) {
	            Book b = it.next();
	            if (b.id == id) {
	                it.remove();
	                System.out.println("Book Deleted!");
	                return;
	            }
	        }
	        System.out.println("Book Not Found!");
	    }
	}