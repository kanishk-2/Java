public class DaysToYWD {
    public static void main(String[] args) {
        // Total number of days (hardcoded using a standard 365-day year)
        int totalDays = 800;

        // Step 1: Calculate full years (365 days per year).
        int years = totalDays / 365;

        // Step 2: Find days left over after removing full years.
        // Equivalent to: totalDays - (years * 365)
        int remainingAfterYears = totalDays % 365;

        // Step 3: Convert leftover days into full weeks (7 days per week).
        int weeks = remainingAfterYears / 7;

        // Step 4: Find final leftover days after removing full weeks.
        // Equivalent to: remainingAfterYears - (weeks * 7)
        int days = remainingAfterYears % 7;

        // Print the final breakdown
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}

/*
Problem Explanation (Days to Years, Weeks, and Days):
- Goal: Convert a total number of days (without user input) into whole years,
  remaining weeks, and remaining days.
- Conversion facts (standard non-leap calendar basis):
  * 1 year = 365 days
  * 1 week = 7 days
- Step-by-step logic using integer division (/) and modulo (%):
  1. years = totalDays / 365 -> Finds how many full 365-day years fit into
     totalDays (fractional part is dropped).
  2. remainingAfterYears = totalDays % 365 -> Finds the leftover days after
     removing all full years.
  3. weeks = remainingAfterYears / 7 -> Converts those leftover days into full
     7-day weeks.
  4. days = remainingAfterYears % 7 -> Finds the final leftover days that do
     not form another full week.
- Example with totalDays = 800:
  * years = 800 / 365 = 2
  * remainingAfterYears = 800 % 365 = 70
  * weeks = 70 / 7 = 10
  * days = 70 % 7 = 0
  * Output: 2 Years, 10 Weeks, 0 Days.
*/
