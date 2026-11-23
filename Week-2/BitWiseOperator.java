class BitWiseOperator  {

	public static void main(String[] args) {
		
		// & | ^ are bitwise operator
		int num1=20;
		int num2=45;

		System.out.println(" & operator value: " + (num1&num2));
		System.out.println(" | operator value: " + (num1|num2));
		System.out.println(" ^ operator value: " + (num1^num2));

	}
	
}

/*
 * THEORY: BITWISE OPERATORS IN JAVA (&, |, ^)
 *
 * 1. What Are Bitwise Operators?
 *    Bitwise operators work directly on the individual binary bits (0s and 1s) of
 *    integral operands (byte, short, int, long, and char). Even though num1 and num2
 *    are written in decimal (20 and 45), the JVM evaluates &, |, and ^ bit-by-bit
 *    across their 32-bit binary representation and produces an int result.
 *    (Note: Unlike logical && and ||, single & and | do NOT short-circuit when
 *    used on booleans, and when used on integers they always perform bitwise
 *    operations—not boolean logical operations.)
 *
 * 2. Converting the Operands to Binary (8-bit view of 32-bit int):
 *    - num1 = 20 -> 16 + 4 = 00010100 (binary)
 *    - num2 = 45 -> 32 + 8 + 4 + 1 = 00101101 (binary)
 *
 *    Bit positions (from right to left, weight 2^0 to 2^7):
 *      Bit index :  7   6   5   4   3   2   1   0
 *      Weight    : 128  64  32  16   8   4   2   1
 *      num1 (20) :  0   0   0   1   0   1   0   0
 *      num2 (45) :  0   0   1   0   1   1   0   1
 *
 * 3. Bitwise AND (&):
 *    - Rule: Result bit is 1 ONLY if BOTH corresponding bits are 1; otherwise 0.
 *      (1 & 1 = 1; 1 & 0 = 0; 0 & 1 = 0; 0 & 0 = 0)
 *    - Bitwise calculation for 20 & 45:
 *        00010100  (20)
 *      & 00101101  (45)
 *      ----------
 *        00000100  -> Only bit 2 (weight 4) is 1 in both numbers.
 *    - Decimal value: 4 -> Output: " & operator value: 4"
 *    - Common uses: Bit masking, checking if a specific bit/flag is set, or
 *      testing even/odd numbers (n & 1).
 *
 * 4. Bitwise OR (|):
 *    - Rule: Result bit is 1 if AT LEAST ONE corresponding bit is 1; 0 only when
 *      both bits are 0.
 *      (1 | 1 = 1; 1 | 0 = 1; 0 | 1 = 1; 0 | 0 = 0)
 *    - Bitwise calculation for 20 | 45:
 *        00010100  (20)
 *      | 00101101  (45)
 *      ----------
 *        00111101  -> Bits 5, 4, 3, 2, and 0 are 1.
 *    - Decimal value: 32 + 16 + 8 + 4 + 1 = 61 -> Output: " | operator value: 61"
 *    - Common uses: Setting specific bits/flags on or combining bitmasks.
 *
 * 5. Bitwise XOR (^ - Exclusive OR):
 *    - Rule: Result bit is 1 if the two corresponding bits are DIFFERENT; 0 if
 *      they are the SAME.
 *      (1 ^ 1 = 0; 0 ^ 0 = 0; 1 ^ 0 = 1; 0 ^ 1 = 1)
 *    - Bitwise calculation for 20 ^ 45:
 *        00010100  (20)
 *      ^ 00101101  (45)
 *      ----------
 *        00111001  -> Bit 2 is 1 in both (becomes 0); bits 5, 4, 3, and 0
 *                     differ (become 1).
 *    - Decimal value: 32 + 16 + 8 + 1 = 57 -> Output: " ^ operator value: 57"
 *    - Common uses: Toggling specific bits/flags, finding non-duplicate elements,
 *      and bitwise swap tricks.
 */

