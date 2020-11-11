package edu.csp.csc420.week3;

public class GenericSamples {

    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.setManufacturer("Fender");

        System.out.println("Guitar made by: " + g.getManufacturer());
        Guitar g2 = changeMan2(g);
        System.out.println("Guitar made by: " + g.getManufacturer());
        System.out.println("Guitar2 made by: " + g2.getManufacturer());
    }

    public static void changeMan(Guitar g) {
        g.setManufacturer("Gibson");
    }

    public static Guitar changeMan2(Guitar g) {
        Guitar g2 = new Guitar();
        g2.setManufacturer("Some dude");
        return g2;
    }

}
