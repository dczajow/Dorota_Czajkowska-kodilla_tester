package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classes = new ArrayList<>();

    public School(String name, int ... classes){
        this.name = name;
        for(int group: classes ){
            this.classes.add(group);
        }
    }

    public String getName() {
        return name;
    }

    public int getStudentsTotal(){
        int total = 0;
        for(int classSize: classes){
            total += classSize;
        }
        return total;
    }

    @Override
    public String toString() {
        return "School: " + this.name + " , total number of students: " + classes.toString();
    }
}