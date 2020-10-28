package edu.csp.csc420.week1;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private String color;
    private int size;

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

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }

    public static class colorComparator implements Comparator<Fruit> {

        @Override
        public int compare(Fruit f1, Fruit f2) {
            return f1.getColor().compareToIgnoreCase(f2.getColor());
        }
    }

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
