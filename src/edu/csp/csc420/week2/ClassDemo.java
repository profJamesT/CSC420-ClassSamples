package edu.csp.csc420.week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ClassDemo {
    public static void main(String[] args) {
        Random random = new Random();

        List<String> list = new ArrayList<>();

        list.add("Paul");
        list.add("Peter");
        list.add("Mark");
        list.add("Luke");


        System.out.println("Random Person is: " + list.get(random.nextInt(list.size())));
        System.out.println("Random Person is: " + list.get(random.nextInt(list.size())));
        System.out.println("Random Person is: " + list.get(random.nextInt(list.size())));
        System.out.println("Random Person is: " + list.get(random.nextInt(list.size())));
    }
}
