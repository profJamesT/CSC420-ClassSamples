package edu.csp.csc420.week6;

public class Week6Demo {

    public static void main(String[] args) {
        String name = "James";
        System.out.println("Hash of " + name + " > " + name.hashCode());
        name = "james";
        System.out.println("Hash of " + name + " > " + name.hashCode());
        name = "JameS";
        System.out.println("Hash of " + name + " > " + name.hashCode());
        name = "jameS";
        System.out.println("Hash of " + name + " > " + name.hashCode());
        name = "James";
        System.out.println("Hash of " + name + " > " + name.hashCode());

        //possible hashcode function found on StackOverflow: https://stackoverflow.com/questions/15518418/whats-behind-the-hashcode-method-for-string-in-java
        int h = 0;
        if (h == 0 && name.length() > 0) {
            char val[] = name.toCharArray();

            for (int i = 0; i < name.length(); i++) {
                h = 31 * h + val[i];
            }
        }

        System.out.println("HASH of " + name + " > " + h);
    }
}
