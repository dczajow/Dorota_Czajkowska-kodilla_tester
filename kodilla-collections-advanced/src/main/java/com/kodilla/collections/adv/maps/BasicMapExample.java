package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        Double grade = grades.get("Mathematics");
        System.out.println(grade);

        for(Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue());
        };

        // entrySet() --> zwraca zbiór wszystkich elementów mapy.
        // Ta metoda zwraca zawartość całej mapy w postaci zbioru (Set)
        // obiektów typu Entry – czyli pojedynczych wpisów w mapie,
        // z których każdy ma klucz i wartość.
        // Klasa Entry jest zdefiniowana jako wewnętrzna klasa w interfejsie Map,
        // dlatego też aby się dostać do jej definicji, stosujemy zapis Map.Entry.
        // Musimy też pamiętać o podaniu typów klucza i wartości;
        // w naszym przypadku będzie to Map.Entry<String, Double>.
    }
}
