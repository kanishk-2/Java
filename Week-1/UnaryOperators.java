public class UnaryOperators {
    public static void main(String[] args) {

        // ============================================================
        // 1. PRE-INCREMENT (++x) vs POST-INCREMENT (x++)
        // ============================================================
        int a = 10;
        System.out.println("--- INCREMENT (++) ---");
        System.out.println("Initial a = " + a);

        // Pre-increment (++a): Increments 'a' FIRST (10 -> 11), THEN uses the new value (11)
        int preInc = ++a;
        System.out.println("After ++a: preInc = " + preInc + ", current a = " + a);

        // Post-increment (a++): Uses the CURRENT value of 'a' (11) FIRST, THEN increments 'a' (11 -> 12)
        int postInc = a++;
        System.out.println("After a++: postInc = " + postInc + ", current a = " + a);

        // ============================================================
        // 2. PRE-DECREMENT (--b) vs POST-DECREMENT (b--)
        // ============================================================
        int b = 10;
        System.out.println("\n--- DECREMENT (--) ---");
        System.out.println("Initial b = " + b);

        // Pre-decrement (--b): Decrements 'b' FIRST (10 -> 9), THEN uses the new value (9)
        int preDec = --b;
        System.out.println("After --b: preDec = " + preDec + ", current b = " + b);

        // Post-decrement (b--): Uses the CURRENT value of 'b' (9) FIRST, THEN decrements 'b' (9 -> 8)
        int postDec = b--;
        System.out.println("After b--: postDec = " + postDec + ", current b = " + b);
    }

}

/*
     * =========================================================================
     * THEORY: INCREMENT (++) AND DECREMENT (--) OPERATORS
     * =========================================================================
     * Increment (++) and decrement (--) are unary operators that change a
     * numeric variable's value by 1:
     *
     * 1. Pre-increment (++x) : Increases x by 1 BEFORE using x in the
     *                          surrounding expression.
     * 2. Post-increment (x++) : Uses the current value of x in the expression
     *                          FIRST, then increases x by 1.
     * 3. Pre-decrement (--x)  : Decreases x by 1 BEFORE using x in the
     *                          surrounding expression.
     * 4. Post-decrement (x--) : Uses the current value of x in the expression
     *                          FIRST, then decreases x by 1.
     *
     * =========================================================================
     * HOW IT WORKS (STEP-BY-STEP EXECUTION)
     * =========================================================================
     * 1. Increment (++):
     *    - Starts with a = 10.
     *    - int preInc = ++a;
     *      'a' is incremented from 10 to 11 first, so preInc gets 11 and
     *      'a' is 11.
     *    - int postInc = a++;
     *      postInc receives the current value of 'a' (11) first, and then 'a'
     *      is incremented from 11 to 12.
     *
     * 2. Decrement (--):
     *    - Starts with b = 10.
     *    - int preDec = --b;
     *      'b' is decremented from 10 to 9 first, so preDec gets 9 and
     *      'b' is 9.
     *    - int postDec = b--;
     *      postDec receives the current value of 'b' (9) first, and then 'b'
     *      is decremented from 9 to 8.
     * =========================================================================
*/
