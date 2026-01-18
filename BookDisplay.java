package com.syntecxhub.library.model;
import java.util.*;

public class BookDisplay {
    public static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No Books Available!");
            return;
        }
        System.out.println("ID | Title | Author");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
