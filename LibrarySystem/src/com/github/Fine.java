package com.github;

import java.util.ArrayList;
import java.util.List;

public class Fine {
	
	public final int starterFine = 6;
	public List<Customer> customers;
	public List<Book> books; 
	
	public Fine() {
		this.customers = new ArrayList<>();
		this.books = new ArrayList<>();
	}

	protected int getStarterFine() {
		return starterFine;
	}

	public List<Customer> getCustomer() {
		return customers;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	 public void addBook(Book book) {
	        books.add(book);
	 }
	 
	 public void addCustomer(Customer customer) {
		  customers.add(customer);
	 }
	
}
