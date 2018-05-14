package com.ttdev.bs;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class BookClient {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/bs");
		BookState book = new BookState();
		
		//GET 1234
		client.path("books/1234");
		book = client.get(BookState.class);
		System.out.println("Titulo para 1234: " + book.getTitle());
		
		//UPDATE 1234
		book.setTitle("Origami para daw");
		client.put(book);
		
		BookState book2 = new BookState();
		book2 = client.get(BookState.class);
		System.out.println("Titulo modificado para 1234: " + book.getTitle());
		
		//ADD 4567
		book.setIsbn("4567");
		book.setTitle("Cloud computing 101");
		client.back(true);
		client.path("books");
		client.post(book);
		
		client.path("4567");
		book2 = client.get(BookState.class);
		System.out.println("Titulo 4567: " + book2.getTitle());
		
		//DELETE
		client.delete();
		Response response = client.get();
		System.out.println("Respuesta para el objeto eliminado: " + response.getStatus());

	}

}
