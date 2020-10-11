package com.kodilla.stream.exceptions;

public class FirstExample {
    public static void main(String[] args) {
            String username = "John Smith";
            String[] nameParts = username.split(" ");
            System.out.println("Firstname: " + nameParts[0]);
            System.out.println("Lastname: " + nameParts[1]);
        }
    }