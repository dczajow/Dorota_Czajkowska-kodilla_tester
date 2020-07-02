package CaveOfProgramming;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in Celcius degrees to convert > ");
        double celcius = scanner.nextFloat();
        double fahrenheit = (celcius * 9.0/5.0) + 32;
        System.out.printf("%.1F Celcius degrees equals %.1f Fahrenheit degrees.", celcius, fahrenheit);
    }
}
