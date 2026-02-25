package com.subrat.sbeans;

public class Author {
	private String authorId;
	private String authorName;
	
	public Author(String authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	
	public String displayAuthorInfo() {
		return "Author : "+this.authorName;
	}

}
