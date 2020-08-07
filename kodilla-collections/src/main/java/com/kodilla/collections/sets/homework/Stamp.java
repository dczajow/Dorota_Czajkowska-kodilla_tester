package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String name;
    Boolean isFranked;
    double width;
    double hight;

    public Stamp(String name, Boolean isFranked, double width, double hight) {
        this.name = name;
        this.isFranked = isFranked;
        this.width = width;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public Boolean getFranked() {
        return isFranked;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.hight, hight) == 0 &&
                Objects.equals(name, stamp.name) &&
                Objects.equals(isFranked, stamp.isFranked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isFranked, width, hight);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", isFranked=" + isFranked +
                ", width=" + width +
                ", hight=" + hight +
                '}';


    }
}
