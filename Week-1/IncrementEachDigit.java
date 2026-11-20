//Q2.Increment Each Digit of a 5-Digit Number by 1

/*
Write a Java program that takes a 5-digit integer and increments every individual digit by 1 
using only standard arithmetic operators (+, -, *, /, %). 
If any digit in the original number is 9, adding 1 to it must wrap around to 0 
without carrying over into the adjacent place value 
(for example, 12191 becomes 23202 and 12999 becomes 23000). 
*/


public class IncrementEachDigit {

    public static void main(String args[]) {
        // Step 1: Initialize a 5-digit number (e.g., 12345, 12191, or 12999)
        int num = 12191;

        // Step 2: Extract each digit from right to left and add 1 (wrapping 9 -> 0)
        // Units place (1s)
        int d1 = ((num % 10) + 1) % 10;
        int temp = num / 10;

        // Tens place (10s)
        int d2 = ((temp % 10) + 1) % 10;
        temp = temp / 10;

        // Hundreds place (100s)
        int d3 = ((temp % 10) + 1) % 10;
        temp = temp / 10;

        // Thousands place (1000s)
        int d4 = ((temp % 10) + 1) % 10;
        temp = temp / 10;

        // Ten-thousands place (10000s)
        int d5 = ((temp % 10) + 1) % 10;

        // Step 3: Reconstruct the 5-digit number by multiplying each digit by its place value
        int result = (d5 * 10000) + (d4 * 1000) + (d3 * 100) + (d2 * 10) + d1;

        // Step 4: Display the original input and final output
        System.out.println("Input:  " + num);
        System.out.println("Output: " + result);
    }
}
