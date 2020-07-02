package CaveOfProgramming;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę km to przeliczenia na mile >");

        double km = scanner.nextDouble();
        double miles = km * 0.621371;

        System.out.printf("%.1f km to %.1.f mili.\n", km, miles);
    }
}
