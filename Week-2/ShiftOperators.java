class ShiftOperators {

	public static void main(String[] args) {
		
		int num = 24;
		
		System.out.println(num << 2); //left shift operator

		int val = 15;

		System.out.println(val << 3);

		System.out.println(val >> 2); //right shift operator

		System.out.println(val >> 3);

	}
	
}

/*
 * THEORY : SHIFT OPERATORS IN JAVA (<< AND >>)
 *
 * 1. Core Shift Formulas:
 *    Let 'x' be the operand and 'n' be the shift count:
 *
 *    - Left Shift Formula (<<):
 *        x<<y = x * (2^y)
 *      (Shifts bits left by n positions, filling n rightmost bits with 0.
 *
 *    - Right Shift Formula (>>):
 *        x>>y= (x / (2^y))
 *      (Shifts bits right by n positions, discarding n rightmost bits and filling
 *       n leftmost bits with the sign bit: 0 for positive x, 1 for negative x.
 *
 * 2. Applying the Formulas to Each Line in This Program:
 *
 *    - num << 2   where num = 24, n = 2
 *        Formula : 24 * (2^2) = 24 * 4 = 96
 *        Binary  : 00011000 << 2  =>  01100000  = 96
 *        Output  : 96
 *
 *    - val << 3   where val = 15, n = 3
 *        Formula : 15 * (2^3) = 15 * 8 = 120
 *        Binary  : 00001111 << 3  =>  01111000  = 120
 *        Output  : 120
 *
 *    - val >> 2   where val = 15, n = 2
 *        Formula : (15 / (2^2)) = (15 / 4) = (3.75) = 3
 *        Binary  : 00001111 >> 2  =>  00000011  = 3
 *        Output  : 3
 *
 *    - val >> 3   where val = 15, n = 3
 *        Formula : (15 / (2^3)) = (15 / 8) = (1.875) = 1
 *        Binary  : 00001111 >> 3  =>  00000001  = 1
 *        Output  : 1
 */
