package com.subrat.sbeans;

import java.util.List;

public class Library {
	private String libraryName;
	private List<Book> books;
	
	public Library(String libraryName, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	public void showLibraryData() {
		for(Book bk:books) {
			IO.println(bk.displayBookDetails());
		}
	}

	
}
