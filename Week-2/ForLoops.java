public class ForLoops {
    public static void main(String[] args) {
        // 1. SINGLE FOR LOOP
        int sum = 0;

        for (int num = 1; num <= 4; num = num + 1) {
            sum = sum + num;
            System.out.println("[Single-loop] num=" + num + ", sum=" + sum);
        }

        // 2. TWO NESTED FOR LOOPS
        for (int i = 1; i <= 2; i = i + 1) {
            for (int j = 1; j <= 3; j = j + 1) {
                System.out.println("[Two-Loop] i=" + i + ", j=" + j);
            }
        }

        // 3. THREE NESTED FOR LOOPS
        for (int a = 1; a <= 2; a = a + 1) {
            for (int b = 1; b <= 2; b = b + 1) {
                for (int c = 1; c <= 2; c = c + 1) {
                    System.out.println("[Three-Loop] a=" + a + ", b=" + b + ", c=" + c);
                }
            }
        }
    }
}

/*
- THEORY & WORKING-
 *
- 1. Core 'for' Concept:
-    A 'for' loop is entry-controlled and bundles initialization, boolean condition,
-    and update in one header: for (init; condition; update). It evaluates the
-    condition BEFORE each iteration and runs the update AFTER each body execution.
 *
- 2. Single 'for' Loop (Linear Flow):
-    Initializes 'num = 1', checks 'num <= 4', updates 'sum = sum + num'
-    (1 + 2 + 3 + 4 = 10), prints values, and runs 'num = num + 1' until 'num'
-    becomes 5. Executes 4 times -> O(n) time.
 *
- 3. Two Nested 'for' Loops (Outer x Inner):
-    For each outer step ('i' from 1 to 2), the inner 'for' loop re-initializes
-    'j = 1' automatically and runs through 3 before 'i' updates via 'i = i + 1'.
-    Total inner prints = 2 * 3 = 6 -> O(m * n) time.
 *
- 4. Three Nested 'for' Loops (Outer x Middle x Innermost):
-    For each 'a' (1..2) and each 'b' (1..2), 'c' starts fresh at 1 and runs
-    through 1..2. Total innermost prints = 2 * 2 * 2 = 8 -> O(x * y * z) time.
 *
- 5. Key Rules & Space Complexity:
-    - Inner 'for' headers re-initialize their loop variables automatically on every
-      outer pass, reducing stale-counter bugs compared to 'while' loops.
-    - Loop variables declared inside 'for (int ...)' are scoped to that loop block.
-    - Auxiliary space complexity is O(1) across all three because only a fixed set of
-      primitive 'int' variables is used.
 *
- CONSOLE OUTPUT:
- [Single] num=1, sum=1
- [Single] num=2, sum=3
- [Single] num=3, sum=6
- [Single] num=4, sum=10
- [Two-Loop] i=1, j=1
- [Two-Loop] i=1, j=2
- [Two-Loop] i=1, j=3
- [Two-Loop] i=2, j=1
- [Two-Loop] i=2, j=2
- [Two-Loop] i=2, j=3
- [Three-Loop] a=1, b=1, c=1
- [Three-Loop] a=1, b=1, c=2
- [Three-Loop] a=1, b=2, c=1
- [Three-Loop] a=1, b=2, c=2
- [Three-Loop] a=2, b=1, c=1
- [Three-Loop] a=2, b=1, c=2
- [Three-Loop] a=2, b=2, c=1
- [Three-Loop] a=2, b=2, c=2
 */
