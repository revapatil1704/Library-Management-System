package com.syntecxhub.library.model;
import java.io.*;
import java.util.*;

public class BookStorage {
    private static final String FILE_NAME = "books.dat";

    public static List<Book> loadBooks() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            return (List<Book>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void saveBooks(List<Book> books) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(books);
            out.close();
        } catch (Exception e) {
            System.out.println("Error saving data!");
        }
    }
}

