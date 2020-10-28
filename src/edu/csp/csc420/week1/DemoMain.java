package edu.csp.csc420.week1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author James Tucker - jtucker@csp.edu
 */

public class DemoMain {
    public static void main(String[] args) {
        System.out.println("This is the demo file for week 1");

        ArrayList<Fruit> myFruits = new ArrayList<Fruit>();

        Fruit tmpFruit = new Fruit();
        tmpFruit.setName("Banana");
        tmpFruit.setColor("Yellow");
        tmpFruit.setSize(12);
        myFruits.add(tmpFruit);

        tmpFruit = new Fruit();
        tmpFruit.setName("apple");
        tmpFruit.setColor("red");
        tmpFruit.setSize(5);
        myFruits.add(tmpFruit);

        tmpFruit = new Fruit();
        tmpFruit.setName("apple");
        tmpFruit.setColor("Green");
        tmpFruit.setSize(6);
        myFruits.add(tmpFruit);

        tmpFruit = new Fruit();
        tmpFruit.setName("Orange");
        tmpFruit.setColor("orange");
        tmpFruit.setSize(7);
        myFruits.add(tmpFruit);

        System.out.println("No sorting");
        System.out.println(myFruits);

        Collections.sort(myFruits);
        System.out.println("Default sorting (by name)");
        System.out.println(myFruits);

        Collections.sort(myFruits, new Fruit.colorComparator());
        System.out.println("Color sorting");
        System.out.println(myFruits);

        Collections.sort(myFruits, new Fruit.sizeComparator());
        System.out.println("Size sorting");
        System.out.println(myFruits);

    }
}

