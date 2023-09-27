package com.github;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Customer customer = new Customer("Milkias",53143);

        List<Book> book1 = new ArrayList<>();
        book1.add(new Book("booktitle1", new Date(), "Joe Pastman", "Sweden", "Thriller", 200));

        List<Book> book2 = new ArrayList<>();
        book2.add(new Book("booktitle2", new Date(), "Josh Dunn", "Finland", "Education", 402));
        
        List<Book> book3 = new ArrayList<>();
        book3.add(new Book("booktitle3", new Date(), "Josh Dunn", "Finland", "Education", 402));
        
        List<Book> book4 = new ArrayList<>();
        book4.add(new Book("booktitle4", new Date(), "Josh Dunn", "Finland", "Education", 402));

        List<Book> book5 = new ArrayList<>();
        book5.add(new Book("booktitle5", new Date(), "Josh Dunn", "Finland", "Education", 402));

        
        
        Card card = new Card(1233456);
        card.addBooks(book1);

        // Print the books in the card
        List<Book> cardBooks = card.getBooks();
        for (Book book : cardBooks) {
            System.out.println(book1.toString());
        }
        card.borrowingPrivileges(book1, customer);
        card.borrowingPrivileges(book2, customer);
        card.borrowingPrivileges(book3, customer);
        card.borrowingPrivileges(book4, customer);
        card.borrowingPrivileges(book5, customer);
        
        library.getBooks().addAll(book1);        
    }
}
