/* Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30, tak długo,
aż ich suma przekroczy 5000. Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.

 */

import java.util.Random;

public class RandomNumbers {
   public static void main(String[] args) {
       Random generator = new Random();
       int suma = 0;
       do {
           if(suma<5001) {
               int wylosowanaLiczba = generator.nextInt(31);
               suma += wylosowanaLiczba;
           }
           System.out.println(suma);
       }
       while (suma < 5001);
    }
}