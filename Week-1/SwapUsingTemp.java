//Write a Java program to swap the values of two integer variables (n1 and n2) using a third temporary variable (temp). 
//Display the values of both variables before and after swapping to verify the result.

public class SwapUsingTemp {
    public static void main(String[] args) {
        // Initialize two integer variables
        int n1 = 10;
        int n2 = 20;
        int temp; // Temporary variable to hold a value during swap

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        // Step 1: Store the value of n1 in temp so it isn't lost
        temp = n1;

        // Step 2: Assign the value of n2 to n1
        n1 = n2;

        // Step 3: Assign the original value of n1 (stored in temp) to n2
        n2 = temp;

        System.out.println("After swapping:  n1 = " + n1 + ", n2 = " + n2);
    }
}


/*
Q1.Swapping Using temp (With User Input)

import java.util.Scanner;

public class SwapUsingTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        int temp;

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping:  n1 = " + n1 + ", n2 = " + n2);

        sc.close();
    }
}

*/
