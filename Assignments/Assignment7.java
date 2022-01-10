package Assignments;

import java.time.LocalDate;
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        String Day, Month, Year;
        System.out.println("Enter the Day: ");
        try (Scanner sc = new Scanner(System.in)) {
            Day = sc.nextLine();

            System.out.println("Enter the Month: ");
            Month = sc.nextLine();

            System.out.println("Enter the Year: ");
            Year = sc.nextLine();
        }
        LocalDate Date = LocalDate.of(Integer.parseInt(Year), Integer.parseInt(Month), Integer.parseInt(Day));
        System.out.println("Datesupto:" + Date);
        for (int i = 1; i <= Integer.parseInt(Day); i++) {
            LocalDate Display = LocalDate.of(Integer.parseInt(Year), Integer.parseInt(Month), i);
            System.out.println(Display + " is " + Display.getDayOfWeek());
        }
    }
}
