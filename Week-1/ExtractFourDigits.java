/*
Q1. Extract Digits of a 4-Digit Number-

Write a Java program that takes a 4-digit integer 
(for example, 5473) and isolates each of its individual digits one by one from right to left. 
Using basic arithmetic operators such as modulus (%) to extract the remainder 
and integer division (/) to remove the last digit, separate all four digits cleanly. 
Store the extracted digits from the units place to the thousands place in four 
separate integer variables named x, y, z, and w respectively. 
Finally, print the original number along with the value stored in each variable to verify the extraction.
*/

public class ExtractFourDigits {

    public static void main(String args[]) { 
        // Step 1: Initialize a 4-digit number
        int num = 5473;

        // Step 2: Extract the last (units) digit using % 10 -> 3
        int x = num % 10;
        // Remove the last digit using / 10 -> 547
        int div1 = num / 10;

        // Step 3: Extract the tens digit from div1 -> 7
        int y = div1 % 10;
        // Remove the last digit of div1 -> 54
        int div2 = div1 / 10;

        // Step 4: Extract the hundreds digit from div2 -> 4
        int z = div2 % 10;
        // Remove the last digit of div2 -> 5
        int div3 = div2 / 10;

        // Step 5: Extract the thousands (first) digit from div3 -> 5
        int w = div3 % 10;

        // Step 6: Print the original number and all extracted variables
        System.out.println("Original Number: " + num);
        System.out.println("x (Units digit):     " + x);
        System.out.println("y (Tens digit):      " + y);
        System.out.println("z (Hundreds digit):  " + z);
        System.out.println("w (Thousands digit): " + w);
    }

}
