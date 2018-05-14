//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.05.02 a las 10:02:42 AM CVT 
//


package com.ttdev.bs;

import java.util.Date;


public class Book {

    protected String isbn;
    protected String title;
    private Date lastModified;

    
    
    
    
    public Book(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.setLastModified(new Date());
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

    public String getIsbn() {
        return isbn;
    }

  
    public void setIsbn(String value) {
        this.isbn = value;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String value) {
        this.title = value;
    }

}
