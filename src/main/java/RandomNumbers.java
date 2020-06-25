/* Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30, tak długo,
aż ich suma przekroczy 5000. Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.

 */

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        int suma = 0;
        int min = 30;
        int max = 0;
        while (suma < 5001) {
            int wylosowanaLiczba = generator.nextInt(31);
            if (wylosowanaLiczba > max) {
                max = wylosowanaLiczba; }
            if (wylosowanaLiczba < min) {
                min = wylosowanaLiczba; }
            suma += wylosowanaLiczba;
        }
        System.out.println("Najniższa wylosowana liczba to: " +min);
        System.out.println("Najwyższa wylosowana liczba to: " +max);
        System.out.println("Suma; " +suma);
    }
}
