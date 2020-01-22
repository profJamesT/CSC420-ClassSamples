package edu.csp.csc420.week2;

public class Recursion {

    public static void main(String[] args) {
        printMeXTimes("hello", 10);
    }

    private static void printMeXTimes(String message, int numTimes) {
        //if numtimes is > 0, then we print and continue, else nothing happens and recursion ends
        if (numTimes > 0) {
            System.out.println(message);
            printMeXTimes(message, --numTimes);
        }

    }

}
