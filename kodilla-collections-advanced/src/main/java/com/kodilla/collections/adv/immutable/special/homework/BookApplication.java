package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Neverending Story", "Michael Ende");
        Book book2 = bookManager.createBook("Mathilde", "Ronald Dahl");
        Book book3 = bookManager.createBook("Hunger Games", "Suzanne Collins");
        Book book4 = bookManager.createBook("The last wish", "Andrzej Sapkowski");
        Book book5 = bookManager.createBook("Neverending Story", "Michael Ende");

    }
}
