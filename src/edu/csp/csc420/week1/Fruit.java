package edu.csp.csc420.week1;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private String color;
    private int size;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Always nice to be able to print out an object easily
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    //this is a require override since we are implementing Comprable
    @Override
    public int compareTo(Fruit f) {
        return this.getName().compareToIgnoreCase(f.getName());
    }

    //this is a custom sorting class
    public static class colorComparator implements Comparator<Fruit> {

        @Override
        public int compare(Fruit f1, Fruit f2) {
            return f1.getColor().compareToIgnoreCase(f2.getColor());
        }
    }

    //another customer sorting class
    public static class sizeComparator implements Comparator<Fruit> {

        @Override
        public int compare(Fruit f1, Fruit f2) {
            if (f1.getSize() > f2.getSize()) {
                return 1;
            }
            else if (f1.getSize() < f2.getSize()) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
