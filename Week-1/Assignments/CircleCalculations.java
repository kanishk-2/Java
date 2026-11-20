// Write a  program to enter the radius of a circle and find its diameter, circumference and area.


import java.util.Scanner;

class CircleCalculations {
	public static void main( String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();

		double diameter = 2 * radius;
        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Diameter of the circle = " + diameter);
        System.out.println("Circumference of the circle = " + circumference);
        System.out.println("Area of the circle = " + area);

        sc.close();

	}

}
