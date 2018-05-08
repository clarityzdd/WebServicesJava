package org.example.bookservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("books/{isbn}")
public class BookResource {

	@GET
	public  Book getDetails(@PathParam("isbn") String isbn) {
		if(isbn.equals("1234")) {
			Book book = new Book();
			book.setIsbn("1234");
			book.setTitle("Extreme DAW");
			return book;
		}
		return null;
	}
	
}
