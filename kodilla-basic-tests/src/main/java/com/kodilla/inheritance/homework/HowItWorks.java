package com.kodilla.inheritance.homework;

public class HowItWorks {
    public static void main(String[] args) {

        Android android = new Android(2020);
        android.turnOn();
        android.turnOff();
        System.out.println(android.releaseDate);

        WindowsPhone winPhone = new WindowsPhone(2019);
        winPhone.turnOn();
        winPhone.turnOff();
        System.out.println(winPhone.releaseDate);

    }
}
