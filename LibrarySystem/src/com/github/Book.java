package com.github;

import java.util.Date;

public class Book {
	
	private String bookTitle;
	private Date bookReleaseDate;
	private String author;
	private String country;
	private String genre;
	private int pages;
	
	
	public Book(String bookTitle, Date bookReleaseDate, String author, String country, String genre,
            int pages) {
	   this.bookTitle = bookTitle;
	   this.bookReleaseDate = bookReleaseDate;
	   this.author = author;
	   this.country = country;
	   this.genre = genre;
	   this.pages = pages;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public Date getBookReleaseDate() {
		return bookReleaseDate;
	}
	public String getAuthor() {
		return author;
	}
	public String getCountry() {
		return country;
	}
	public String getGenre() {
		return genre;
	}
	public int getPages() {
		return pages;
	}
	
	@Override
	public String toString() {
		return "Book Title: " + bookTitle +
		           "\nRelease Date: " + bookReleaseDate +
		           "\nAuthor: " + author +
		           "\nCountry: " + country +
		           "\nGenre: " + genre +
		           "\nPages: " + pages;
	}

}
