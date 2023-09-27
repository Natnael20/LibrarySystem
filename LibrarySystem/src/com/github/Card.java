package com.github;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Card {

    public final int maxBorrowCount = 3; // Maximum allowed books
	public final int daysToborrow = 30;
    private long cardNumber;
	private Date dateOfIssue;
	private Date expirationDate;
	public List<Fine> fines;
	protected List<Customer> userInformation;
	protected List<Book> books;
	
	public Card(long cardNum) {
		this.cardNumber = cardNum;
		this.userInformation = new ArrayList<>();
		this.dateOfIssue = new Date();
		this.expirationDate = new Date();
		this.fines = new ArrayList<>();
		this.books = new ArrayList<>();
	}
	
	
	public long getCardNumber() {
		return cardNumber;
	}
	public List<Customer> getUserInformation() {
		return userInformation;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public List<Fine> getFines() {
		return fines;
	}
	
    public List<Book> getBooks() {
        return books;
    }
    
    public void addBooks(List<Book> booksToAdd) {
        this.books.addAll(booksToAdd);
    }
	
    // the user is allowed to borrow 3 books
    public void borrowingPrivileges(List<Book> booksToBorrow, Customer customer) {
    	
    	 int borrowedCount = customer.getBorrowedBooks().size();
    	  int remainingSlots = maxBorrowCount - borrowedCount;

    	    if (remainingSlots >= booksToBorrow.size()) {
    	        for (Book book : booksToBorrow) {
    	            customer.addBook(book);
    	            System.out.println("Book '" + book.getBookTitle() + "' added to the card.");
    	        }
    	    } else {
    	        System.out.println("Sorry, you have reached the maximum allowed books.");
    	    }
    }
    
    
    // each time the user borrow books, it is only allowed to return books before 30 days
    // unless the user decided to exceed the borrowing days up to 90 days. after that if the book/books are
    // not returned, the user will be fined
    public void fine(Fine fine, Book book, Customer customer) {
        int maxBorrowDays = 30; // Maximum allowed borrowing days

        // Check if the customer has previously borrowed this book
        if (customer.getBorrowedBooks().contains(book)) {
            int totalBorrowedTimes = customer.getTotalBorrowedDays(book);
            // Check if it's the second or third time borrowing
            if (totalBorrowedTimes == 2 || totalBorrowedTimes == 3) {
                // Check if the book was returned within the allowed time frame
                int totalBorrowedDays = customer.getTotalBorrowedDays(book);
                if (totalBorrowedDays <= maxBorrowDays) {
                    System.out.println("Book '" + book.getBookTitle() + "' added to the card.");
                } else {
                    System.out.println("Sorry, book '" + book.getBookTitle() + "' was returned late. You are fined.");
                    // You can impose a fine here if needed
                }
            } else {
                System.out.println("You have already borrowed this book the maximum number of times.");
            }
        } else {
            System.out.println("You haven't borrowed this book yet.");
        }
    }

}
