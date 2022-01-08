package Assignments;
public class TwoRockets {

    public static void main (String[] args) {
        Triangle();
        Square();
        Template();
        Square();
        Triangle();     
    }
    public static void Triangle() {

        System.out.println("   /\\\t\t"+"   /\\");
        System.out.println("  /  \\\t\t"+"  /  \\");
        System.out.println(" /    \\\t\t"+" /    \\");      
    }
    public static void Square() {

        System.out.println("+------+\t"+"+------+");
        System.out.println("|      |\t"+"|      |");
        System.out.println("|      |\t"+"|      |");
        System.out.println("+------+\t"+"+------+");

    }
    public static void Template() {

        System.out.println("|United|\t"+"|United|");
        System.out.println("|States|\t"+"|States|");
    }
}