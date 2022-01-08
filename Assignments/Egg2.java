package Assignments;

public class Egg2 {
    public static void main(String[] args) {
        upperstructure();
        lowerstructure();
        base();
        upperstructure();
        lowerstructure();
        base();
        lowerstructure();
        upperstructure();
        base();
        lowerstructure();
    }

    public static void upperstructure() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void base() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void lowerstructure() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
