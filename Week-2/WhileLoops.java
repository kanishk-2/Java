public class WhileLoops {
    public static void main(String[] args) {
        // 1. SINGLE WHILE LOOP
        int num = 1;
        int sum = 0;

        while (num <= 4) {
            sum = sum + num;
            System.out.println("[Single] num=" + num + ", sum=" + sum);
            num = num + 1;
        }

        // 2. TWO NESTED WHILE LOOPS
        int i = 1;

        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                System.out.println("[Two-Loop] i=" + i + ", j=" + j);
                j = j + 1;
            }
            i = i + 1;
        }

        // 3. THREE NESTED WHILE LOOPS
        int a = 1;

        while (a <= 2) {
            int b = 1;
            while (b <= 2) {
                int c = 1;
                while (c <= 2) {
                    System.out.println("[Three-Loop] a=" + a + ", b=" + b + ", c=" + c);
                    c = c + 1;
                }
                b = b + 1;
            }
            a = a + 1;
        }
    }
}

/*
 * THEORY & WORKING EXPLANATION
 *
 * 1. Core 'while' Concept:
 *    A 'while' loop is entry-controlled: it checks its boolean condition BEFORE each
 *    iteration. If the condition starts false, the body runs 0 times. Each pass must
 *    update a control variable toward termination to prevent an infinite loop.
 *
 * 2. Single 'while' Loop (Linear Flow):
 *    Runs while 'num <= 4' (num = 1, 2, 3, 4), updating 'sum = sum + num'
 *    (1 + 2 + 3 + 4 = 10) and 'num = num + 1' until 'num' becomes 5.
 *    Executes 4 times -> O(n) time.
 *
 * 3. Two Nested 'while' Loops (Outer x Inner):
 *    For each outer step ('i' from 1 to 2), 'j' starts fresh at 1 and runs through 3
 *    before 'j <= 3' becomes false, then 'i = i + 1'. Total inner prints = 2 * 3 = 6
 *    -> O(m * n) time.
 *
 * 4. Three Nested 'while' Loops (Outer x Middle x Innermost):
 *    For each 'a' (1..2) and each 'b' (1..2), 'c' resets to 1 and runs through 1..2.
 *    Total innermost prints = 2 * 2 * 2 = 8 -> O(x * y * z) time.
 *
 * 5. Key Rules & Space Complexity:
 *    - Always reset inner loop counters inside the outer loop so later passes do not
 *      start with stale values.
 *    - Always update every loop variable so every loop exits.
 *    - Auxiliary space complexity is O(1) across all three because only a fixed set of
 *      primitive 'int' variables is used.
 *
 * CONSOLE OUTPUT:
 * [Single] num=1, sum=1
 * [Single] num=2, sum=3
 * [Single] num=3, sum=6
 * [Single] num=4, sum=10
 * [Two-Loop] i=1, j=1
 * [Two-Loop] i=1, j=2
 * [Two-Loop] i=1, j=3
 * [Two-Loop] i=2, j=1
 * [Two-Loop] i=2, j=2
 * [Two-Loop] i=2, j=3
 * [Three-Loop] a=1, b=1, c=1
 * [Three-Loop] a=1, b=1, c=2
 * [Three-Loop] a=1, b=2, c=1
 * [Three-Loop] a=1, b=2, c=2
 * [Three-Loop] a=2, b=1, c=1
 * [Three-Loop] a=2, b=1, c=2
 * [Three-Loop] a=2, b=2, c=1
 * [Three-Loop] a=2, b=2, c=2
 */
