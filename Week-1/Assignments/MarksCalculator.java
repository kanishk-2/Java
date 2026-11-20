// Write a  program to enter marks of five subjects and calculate total, average and percentage.

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double sub3 = scanner.nextDouble();

        System.out.print("Enter marks of subject 4: ");
        double sub4 = scanner.nextDouble();

        System.out.print("Enter marks of subject 5: ");
        double sub5 = scanner.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100.0; 

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Percentage = %" + percentage);

        scanner.close();
    }
}
