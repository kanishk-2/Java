/*
problem-
 Write a  program to enter length in centimetres and convert it into meter and kilometer.

*/

import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in centimetres: ");
        double centimetres = sc.nextDouble();

        double meters = centimetres / 100.0;
        double kilometers = centimetres / 100000.0;

        System.out.println("Length in meters = " + meters);
        System.out.println("Length in kilometers = " + kilometers);

        sc.close();
    }
}
