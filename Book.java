
package com.syntecxhub.library.model;
	import java.io.Serializable;

	public class Book implements Serializable {
	    int id;
	    String title;
	    String author;

	    public Book(int id, String title, String author) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	    }

	    public String toString() {
	        return id + " | " + title + " | " + author;
	    }
}
