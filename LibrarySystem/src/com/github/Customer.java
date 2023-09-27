package com.github;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private long cardNumber;
    private List<Book> borrowedBooks;
	private final int TotalBorrowedDays = 90;


    public Customer(String name, long cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Method to add a book to the customer's borrowed books
    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to remove a book from the customer's borrowed books
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Method to get the list of borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
	
	public int getTotalBorrowedDays(Book book) {
		return TotalBorrowedDays;
	}

}
