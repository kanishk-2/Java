//Write a  program to enter the length and breadth of a rectangle and find its perimeter.
//Write a  program to enter the length and breadth of a rectangle and find its area.


import java.util.Scanner;

public class RectangleCalculations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);
        double area = length * breadth;

        System.out.println("Perimeter of the rectangle = " + perimeter);
        System.out.println("Area of the rectangle = " + area);

        sc.close();
    }
}
