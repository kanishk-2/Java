class SecToHrsMinConverter {
    public static void main(String args[]) {

        long seconds = 34625;

        //int min = (int)(seconds/60); --->called narrowing
        long minute = seconds / 60;
        long remsec = seconds % 60;

        // min calcl
        System.out.println("min " + minute);
        System.out.println("remaining sec " + remsec);

        // hr calcl
        System.out.println("Hr " + (seconds / 60) / 60);
        System.out.println("remaining min " + (seconds / 60) % 60);
    }
}

/*
=========================================================================
IMPORTANT CONVERSION DETAILS
=========================================================================
     * - 1 Minute  = 60 Seconds[cite: 1, 2]
     * - 1 Hour    = 60 Minutes = 3,600 Seconds (60 * 60)
     *
     * Formulas Used:
     * - Total Minutes      = seconds / 60[cite: 2]
     * - Remaining Seconds  = seconds % 60[cite: 2]
     * - Hours              = (seconds / 60) / 60   (or seconds / 3600)
     * - Remaining Minutes  = (seconds / 60) % 60[cite: 2]
     *
     * Example (seconds = 34625):[cite: 2]
     * - Total Minutes     = 34625 / 60 = 577 minutes
     * - Remaining Seconds = 34625 % 60 = 5 seconds
     * - Hours             = 577 / 60   = 9 hours
     * - Remaining Minutes = 577 % 60   = 37 minutes
     * - Result            = 9 Hours, 37 Minutes, 5 Seconds
=========================================================================
*/



/*    code explanation--

import java.util.Scanner;

public class SecondsToHoursMinutesConverter {
    public static void main(String[] args) {

        // Create Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter total time in seconds
        System.out.print("Enter total time in seconds: ");
        long seconds = sc.nextLong(); // Using long to support large second values

        // --- Minute & Remaining Seconds Calculation ---
        // Divide total seconds by 60 to get total whole minutes
        long totalMinutes = seconds / 60;

        // Use modulo (%) with 60 to get leftover seconds after forming full minutes
        long remainingSeconds = seconds % 60;

        System.out.println("\n--- Conversion to Minutes & Seconds ---");
        System.out.println("Total Minutes: " + totalMinutes);
        System.out.println("Remaining Seconds: " + remainingSeconds);

        // --- Hour, Remaining Minute & Remaining Seconds Calculation ---
        // Divide total minutes (seconds / 60) by 60 to get total whole hours
        long hours = (seconds / 60) / 60;

        // Use modulo (%) with 60 on total minutes to get remaining minutes after forming hours
        long remainingMinutes = (seconds / 60) % 60;

        System.out.println("\n--- Conversion to Hours, Minutes & Seconds ---");
        System.out.println("Hours: " + hours);
        System.out.println("Remaining Minutes: " + remainingMinutes);
        System.out.println("Remaining Seconds: " + remainingSeconds);

        // Close the Scanner to release system input resources
        sc.close();
    }

*/
