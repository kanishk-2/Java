class NumberSystem {

	public static void main(String[] args) {

		int num = 81;
		System.out.println("Decimal num is        : " + num);
		System.out.println("Decimal to Binary     : " + Integer.toBinaryString(num));
		System.out.println("Decimal to Octal      : " + Integer.toOctalString(num));
		System.out.println("Decimal to Hexadecimal: " + Integer.toHexString(num));

		System.out.println("----------------------------------------");

		// Octal, Hexadecimal, and Binary integer literals (all equal 224 in decimal)
		int octalVal = 0340;       // Prefix '0' denotes base-8 (octal)
		int hexVal = 0Xe0;         // Prefix '0x' or '0X' denotes base-16 (hexadecimal)
		int binaryVal = 0b11100000; // Prefix '0b' or '0B' (since Java 7) denotes base-2 (binary)

		System.out.println("Octal 0340 to Decimal      : " + octalVal);
		System.out.println("Hexadecimal 0Xe0 to Decimal: " + hexVal);
		System.out.println("Binary 0b11100000 to Decimal : " + binaryVal);
	}
}

/*
 * THEORY: NUMBER SYSTEMS & LITERALS IN JAVA
 *
 * 1. Positional Number Systems (Base-r Representation):
 *    In any positional number system with base (radix) 'r', each digit at
 *    position 'k' (counting from 0 on the right) has place value r^k:
 *
 *      Value = d_n * r^n + ... + d_2 * r^2 + d_1 * r^1 + d_0 * r^0
 *
 *    - Decimal (Base 10): Digits 0-9, place values 10^0, 10^1, 10^2...
 *    - Binary  (Base 2) : Digits 0-1, place values 2^0, 2^1, 2^2...
 *    - Octal   (Base 8) : Digits 0-7, place values 8^0, 8^1, 8^2...
 *    - Hexadecimal (Base 16): Digits 0-9 and A-F / a-f (10 to 15), place
 *      values 16^0, 16^1, 16^2...
 *
 * 2. Converting a Decimal int to Other Base Strings:
 *    - Integer.toBinaryString(num):
 *        Converts 'num' (81) into its 32-bit two's complement binary string
 *        without leading zeros:
 *          81 = 64 + 16 + 1 = 2^6 + 2^4 + 2^0 -> "1010001"
 *
 *    - Integer.toOctalString(num):
 *        Groups bits in 3s from the right (since 2^3 = 8) and formats in base 8:
 *          81 = 1 * 8^2 + 2 * 8^1 + 1 * 8^0 = 64 + 16 + 1 -> "121"
 *
 *    - Integer.toHexString(num):
 *        Groups bits in 4s from the right (since 2^4 = 16) and formats in base 16:
 *          81 = 5 * 16^1 + 1 * 16^0 = 80 + 1 -> "51"
 *
 * 3. Writing Non-Decimal Integer Literals in Source Code:
 *    Regardless of how an integer literal is written in code, Java stores the
 *    resulting value as a standard binary int in memory:
 *
 *    - Octal Literal (Prefix '0'):
 *        Any integer literal starting with '0' (and not '0x'/'0X'/'0b'/'0B') is
 *        parsed as base 8. Only digits 0-7 are valid (using 8 or 9 causes a
 *        compile-time error).
 *          0340 = (3 * 8^2) + (4 * 8^1) + (0 * 8^0)
 *               = (3 * 64) + (4 * 8) + 0
 *               = 192 + 32 + 0 = 224
 *
 *    - Hexadecimal Literal (Prefix '0x' or '0X'):
 *        Starts with '0x' or '0X' (case-insensitive for both prefix and hex
 *        letters A-F / a-f).
 *          0Xe0 = (14 * 16^1) + (0 * 16^0)    [since 'e' or 'E' = 14]
 *               = 224 + 0 = 224
 *
 *    - Binary Literal (Prefix '0b' or '0B', introduced in Java 7):
 *        Starts with '0b' or '0B' using only 0s and 1s.
 *          0b11100000 = (1 * 2^7) + (1 * 2^6) + (1 * 2^5)
 *                     = 128 + 64 + 32 = 224
 *
 * 4. Practical Tip:
 *    - Avoid accidental leading zeros on decimal numbers (e.g., writing 012
 *      means octal 12 = decimal 10, not twelve).
 *    - Java also allows underscores (_) inside numeric literals for readability
 *      (e.g., 0b1110_0000), provided they are not placed right after a prefix or
 *      at the start/end of the literal.
 */
