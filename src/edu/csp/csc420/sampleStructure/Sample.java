package edu.csp.csc420.sampleStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
    //Class level variables
    private List<Integer> numberList;

    //Constructor(s)
    Sample() {
        System.out.println("Calling no-arg constructor");
    }


    //Main Method
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();
    }

    //generate random numbers
    public void genNumbers(int numToGenerate) {
        generateNumbersBounded(numToGenerate, Integer.MAX_VALUE);
    }

    //generate random numbers with a max value
    public void genNumbers(int numToGenerate, int maxValue) {
        generateNumbersBounded(numToGenerate, maxValue);
    }

    //display all the numbers generated
    public void displayNumbers() {
        if (numberList == null) {
            System.out.println("Number List is empty");
        } else {
            System.out.println();
            for (int i : numberList) {
                System.out.print(i + " ");
            }
        }
    }

    public void sortNumbers() {
        Collections.sort(numberList);
    }

    //Private Methods

    //kicks off class in an OO way
    private void start() {
        System.out.println("Starting program");
        //this.toString();
        displayNumbers();
        genNumbers(10);
        displayNumbers();
        genNumbers(20, 77);
        displayNumbers();
        System.out.println("\nSorting List");
        sortNumbers();
        displayNumbers();
    }

    //actual method to generate random numbers, but is private
    private void generateNumbersBounded(int numberToGenerate, int maxInteger) {
        //allocate/initialize space for numberList
        numberList = new ArrayList<>();

        for (int i = 0; i < numberToGenerate; i++) {
            numberList.add((int)(Math.random() * maxInteger));
        }
    }

    //Override methods
    @Override
    public String toString() {
        //this could cause a NullPointerException, how would you prevent it?
        return "List has " + numberList.size() + " entries";
    }

    //Getters and Setters

    public List<Integer> getNumberList() {
        return numberList;
    }

    //removed setter since I don't want to allow this
    //You would typically just not create or delete, but wanted to point this out
//    public void setNumberList(List<Integer> numberList) {
//        this.numberList = numberList;
//    }
}
