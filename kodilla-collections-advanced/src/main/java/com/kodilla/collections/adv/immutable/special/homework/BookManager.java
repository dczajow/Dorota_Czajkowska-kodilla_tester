package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        boolean bookAlreadyExist = false;

        for (Book currentBook : books) {
            if (currentBook.toString().equals(book.toString())) {
                System.out.println("Book: " + currentBook.getTitle() + " by: " + book.getAuthor() + " already exists.");
            } else {
                return currentBook;
            }

        }
        if(!bookAlreadyExist){
            books.add(book);
        }
        return book;
    }
}
