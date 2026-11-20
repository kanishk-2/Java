/*
Write a  program to enter two angles of a triangle and find the third angle.
Write a  program to enter the base and height of a triangle and find its area.
Write a  program to calculate the area of an equilateral triangle.
*/


import java.util.Scanner;

public class TriangleCalculations {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 1. Third angle of a triangle
        System.out.print("Enter the first angle (in degrees): ");
        double angle1 = scanner.nextDouble();

        System.out.print("Enter the second angle (in degrees): ");
        double angle2 = scanner.nextDouble();

        double thirdAngle = 180.0 - (angle1 + angle2);
        System.out.println("Third angle of the triangle = " + thirdAngle);

        // 2. Area of a triangle (base and height)
        System.out.print("\nEnter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle = " + area);

        // 3. Area of an equilateral triangle
        System.out.print("\nEnter the side of the equilateral triangle: ");
        double side = scanner.nextDouble();

        double equilateralArea = (Math.sqrt(3) / 4.0) * side * side;
        System.out.println("Area of the equilateral triangle = " + equilateralArea);

        scanner.close();
    }
}
