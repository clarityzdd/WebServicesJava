package com.ttdev.bs;

import java.util.HashMap;
import java.util.Map;

public class BookDB {
	private Map<String,Book> books;
	public BookDB() {
		books = new HashMap<String,Book>();
		Book book1234 = new Book("1234", "java programming");
		addBook(book1234);
	}
	public Book getBook1234() {
		return books.get("1234");
	}
	
	public void addBook(Book book) {
		books.put(book.getIsbn(),	book);
	}
	
	public boolean contains(String isbn) {
		return books.containsKey(isbn);
	}

	public Book getBook(String isbn) {
		return books.get(isbn);
	}
	
	public boolean updateBook(Book book) {
		if (books.containsKey(book.getIsbn())) {
			books.put(book.getIsbn(), book);
			return true;
		} else return false;
	}
	
	public void delete(String isbn) {
		books.remove(isbn);
	}
	public static BookDB instance = new BookDB();

}
