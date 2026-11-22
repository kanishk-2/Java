public class SecondsToHMS {
    public static void main(String[] args) {
        // Total duration in seconds 
        int totalSeconds = 34625;

        // Step 1: Calculate full hours (3600 seconds = 1 hour).
        // Integer division discards fractional hours.
        int hours = totalSeconds / 3600;

        // Step 2: Get seconds remaining after subtracting all full hours.
        // Equivalent to: totalSeconds - (hours * 3600)
        int remainingAfterHours = totalSeconds % 3600;

        // Step 3: Convert the remaining seconds into full minutes (60 seconds = 1 minute).
        int minutes = remainingAfterHours / 60;

        // Step 4: Get the final leftover seconds after subtracting all full minutes.
        // Equivalent to: remainingAfterHours - (minutes * 60)
        int seconds = remainingAfterHours % 60;

        // Print the final breakdown
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}



/*
Problem Explanation (Seconds to Hours, Minutes, and Seconds):
- Goal: Convert a total duration given in seconds (without user input) into whole
  hours, remaining minutes, and remaining seconds.
- Conversion facts:
  * 1 minute = 60 seconds
  * 1 hour = 60 minutes = 60 * 60 = 3600 seconds
- Step-by-step logic using integer division (/) and modulo (%):
  1. hours = totalSeconds / 3600 -> Finds how many full 3600-second hours fit
     into totalSeconds (fractional part is discarded in int arithmetic).
  2. remainingAfterHours = totalSeconds % 3600 -> Finds the leftover seconds
     after taking out all full hours.
  3. minutes = remainingAfterHours / 60 -> Converts those leftover seconds into
     full 60-second minutes.
  4. seconds = remainingAfterHours % 60 -> Finds the final leftover seconds
     that do not form another full minute.
- Example with totalSeconds = 34625:
  * hours = 34625 / 3600 = 9
  * remainingAfterHours = 34625 % 3600 = 2225
  * minutes = 2225 / 60 = 37
  * seconds = 2225 % 60 = 5
  * Output: 9 Hours, 37 Minutes, 5 Seconds.
*/
