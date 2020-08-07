package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampsCollection = new HashSet<>();
        stampsCollection.add(new Stamp("Penny Black", true, 4.3, 3.125));
        stampsCollection.add(new Stamp("krakowski 10 koron", false, 3.95, 3.125));
        stampsCollection.add(new Stamp("900 lecie kroniki Galla Anonima", false, 4.3, 3.125));
        stampsCollection.add(new Stamp("Zabytkowe organy w Polsce", true, 4.3, 3.125));
        stampsCollection.add(new Stamp("Penny Black", false, 4.3, 3.125));
        stampsCollection.add(new Stamp("Zabytkowe organy w Polsce", true, 4.31, 3.125));
        stampsCollection.add(new Stamp("Polskie wzornictwo przemysłowe", true, 4.3, 3.125));
        stampsCollection.add(new Stamp("Polskie wzornictwo przemysłowe", true, 4.3, 3.125));

        System.out.println(stampsCollection.size());
        for (Stamp stamps : stampsCollection)
            System.out.println(stamps);
    }
}
