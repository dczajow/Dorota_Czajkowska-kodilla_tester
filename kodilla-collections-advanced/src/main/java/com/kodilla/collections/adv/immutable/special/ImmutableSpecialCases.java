package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 112;
        Integer b = 112;
        // klasa Integer posiada z góry utworzone, predefiniowane obiekty dla
        // liczb o wartościach od -128 do 127. Zakres ten odpowiada zakresowi
        // wartości, który można zapisać w jednym bajcie pamięci (w wersji ze
        // znakiem). Dzięki temu częste używanie małych liczb nie powoduje
        // zapełniania pamięci komputera nowymi obiektami

        System.out.println(a == b);

        // wynik = false, ponieważ tak naprawdę porównywane są obiekty, a nie wartość zmiennych a i b

        System.out.println(a.equals(b));

        //wynik = true

        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        //ava optymalizuje przechowywanie obiektów klasy String,
        // ponieważ często mogą one zawierać długie łańcuchy znaków.
        // Przy tworzeniu nowej zmiennej Java sprawdza, czy posiada
        // już zmienną o takiej zawartości – jeżeli posiada, zostanie
        // ona wykorzystana ponownie, czyli dwie zmienne będą wskazywały
        // na ten sam obiekt w pamięci komputera.


    }
}
