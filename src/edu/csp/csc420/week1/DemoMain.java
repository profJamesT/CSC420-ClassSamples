package edu.csp.csc420.week1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author James Tucker - jtucker@csp.edu
 */

public class DemoMain {
    public static void main(String[] args) {
        System.out.println("This is the demo file for week 1");

        //change to 128 and see what happens
        Long num1 = 127L;
        Long num2 = 127L;

        if (num1 == num2) {
            System.out.println("Numbers match");
        } else {
            System.out.println("Numbers don't match");
        }



        //create an ArrayList to hold our Fruit
        ArrayList<Fruit> myFruits = new ArrayList<Fruit>();

        //Create a new Fruit object and add it to myFruits
        Fruit tmpFruit = new Fruit();
        tmpFruit.setName("Banana");
        tmpFruit.setColor("Yellow");
        tmpFruit.setSize(12);
        myFruits.add(tmpFruit);

        //re-init the tmpFruit, populate it and then add it to myFruits
        tmpFruit = new Fruit();
        tmpFruit.setName("apple");
        tmpFruit.setColor("red");
        tmpFruit.setSize(5);
        myFruits.add(tmpFruit);

        //re-init the tmpFruit, populate it and then add it to myFruits
        tmpFruit = new Fruit();
        tmpFruit.setName("apple");
        tmpFruit.setColor("Green");
        tmpFruit.setSize(6);
        myFruits.add(tmpFruit);

        //re-init the tmpFruit, populate it and then add it to myFruits
        tmpFruit = new Fruit();
        tmpFruit.setName("Orange");
        tmpFruit.setColor("orange");
        tmpFruit.setSize(7);
        myFruits.add(tmpFruit);

        //print out the myFruits list in the order added
        System.out.println("No sorting");
        System.out.println(myFruits);

        System.out.println("--------------------------");
        for (Fruit f : myFruits) {
            System.out.println(f.toString());
        }
        System.out.println("--------------------------");

        //sort by the default sort, which would be the sort that was added due to implementing Cmoprable
        Collections.sort(myFruits);
        System.out.println("Default sorting (by name)");
        System.out.println(myFruits);

        //sort by the custom sort method that is added as a parameter
        Collections.sort(myFruits, new Fruit.colorComparator());
        System.out.println("Color sorting");
        System.out.println(myFruits);

        //sort by the custom sort method that is added as a parameter
        Collections.sort(myFruits, new Fruit.sizeComparator());
        System.out.println("Size sorting");
        System.out.println(myFruits);

    }
}

