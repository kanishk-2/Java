import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Time period in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter Rate of interest per annum (R): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100.0;

        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
