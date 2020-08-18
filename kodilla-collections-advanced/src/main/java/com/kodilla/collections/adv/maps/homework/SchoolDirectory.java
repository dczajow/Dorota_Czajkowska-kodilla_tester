package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalAndSchool = new HashMap<>();

        Principal dumbledor = new Principal("Albus Dumbledor");
        Principal maxime = new Principal("madame Maxime");
        Principal karkarow = new Principal("Igor Karkarow");
        Principal trunchbull = new Principal("Agatha Trunchbull");
        Principal kleks = new Principal("Ambroży Kleks");

        School hogwarts = new School("Hogwarts", 55, 36, 110, 140, 176);
        School beauxbatons = new School("Beauxbatons", 55, 34, 25, 46, 78, 10, 46);
        School durmstrang = new School("Durmstrang", 200, 245, 304, 297, 276, 299);
        School crunchem_hall = new School("Crunchem Hall Primary School", 22, 23, 25, 21, 26, 21);
        School akademia_pana_kleksa = new School("Akademia Pana Kleksa", 12, 15, 16, 11, 10);


        principalAndSchool.put(dumbledor, hogwarts);
        principalAndSchool.put(maxime, beauxbatons);
        principalAndSchool.put(karkarow, durmstrang);
        principalAndSchool.put(trunchbull, crunchem_hall);
        principalAndSchool.put(kleks, akademia_pana_kleksa);

        for (Map.Entry<Principal, School> entry : principalAndSchool.entrySet())
            System.out.println(entry.getKey().getPrincipalName() + " is a principal of " + entry.getValue().getName()
                    + " with total of: " + entry.getValue().getStudentsTotal() + " students.");

    }
}

