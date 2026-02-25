package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private String bookId;
	private String bookTitle;
	private Author author;
	
	public Book(String bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
    @Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}
   
    public String displayBookDetails() {
    	return "Book id:"+this.bookId+" book title:"+this.bookTitle+" book author:|"+this.author;
    }

	
}
