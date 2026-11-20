//Write a Java program to swap the values of two integer variables (n1 and n2) without using a temporary variable, 
//using only arithmetic addition (+) and subtraction (-). 
//Print the values before and after swapping.


public class SwapWithoutTemp {
    public static void main(String[] args) {
        // Initialize two integer variables
        int n1 = 10;
        int n2 = 20;

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        // Step 1: Store the sum of both numbers in n1 (10 + 20 = 30)
        n1 = n1 + n2;

        // Step 2: Subtract new n2 from sum to get original n1 (30 - 20 = 10)
        n2 = n1 - n2;

        // Step 3: Subtract new n2 from sum to get original n2 (30 - 10 = 20)
        n1 = n1 - n2;

        System.out.println("After swapping:  n1 = " + n1 + ", n2 = " + n2);
    }
}

/*
Q2. Swapping Without temp Using + and - (With User Input)

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After swapping:  n1 = " + n1 + ", n2 = " + n2);

        sc.close();
    }
}

*/
