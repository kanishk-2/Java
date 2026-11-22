public class UnaryIncDecExamples {

    public static void main(String[] args) {
        ex1();  ex2();  ex3();  ex4();  ex5();
        ex6();  ex7();  ex8();  ex9();  ex10();
        ex11(); ex12(); ex13(); ex14(); ex15();
        ex16(); ex17(); ex18(); ex19(); ex20();
        ex21(); ex22(); ex23(); ex24(); ex25();
        ex26(); ex27(); ex28(); ex29(); ex30();
        ex31(); ex32(); ex33(); ex34(); ex35();
        ex36(); ex37(); ex38(); ex39(); ex40();
    }

    static void ex1() {
        int a = 5;
        int b = 3;
        int c = a++ + ++b + a;
        System.out.println(c);
        // Output: 15
        // Working: a++ uses 5 (a->6) + ++b uses 4 (b->4) + a uses 6 = 5 + 4 + 6 = 15.
    }

    static void ex2() {
        int x = 7;
        int y = 2;
        int z = x-- - --y + ++x;
        System.out.println(z);
        // Output: 13
        // Working: x-- uses 7 (x->6) - --y uses 1 (y->1) + ++x uses 7 (x->7) = 7 - 1 + 7 = 13.
    }

    static void ex3() {
        int m = 4;
        int n = 6;
        int result = ++m - n-- + m++ + --n;
        System.out.println(result);
        // Output: 8
        // Working: ++m uses 5 (m->5) - n-- uses 6 (n->5) + m++ uses 5 (m->6) + --n uses 4 (n->4) = 5 - 6 + 5 + 4 = 8.
    }

    static void ex4() {
        int a = 2;
        int b = 3;
        int c = a++ + b++ - --a + --b;
        System.out.println(c);
        // Output: 6
        // Working: a++ uses 2 (a->3) + b++ uses 3 (b->4) - --a uses 2 (a->2) + --b uses 3 (b->3) = 2 + 3 - 2 + 3 = 6.
    }

    static void ex5() {
        int x = 10;
        int y = 5;
        int z = ++x - y-- + x-- + ++y;
        System.out.println(z);
        // Output: 22
        // Working: ++x uses 11 (x->11) - y-- uses 5 (y->4) + x-- uses 11 (x->10) + ++y uses 5 (y->5) = 11 - 5 + 11 + 5 = 22.
    }

    static void ex6() {
        int i = 1;
        int j = i++ + ++i + i;
        System.out.println(j);
        // Output: 7
        // Working: i++ uses 1 (i->2) + ++i uses 3 (i->3) + i uses 3 = 1 + 3 + 3 = 7.
    }

    static void ex7() {
        int p = 9;
        int q = 4;
        int r = p++ + q++ + --p - --q + p;
        System.out.println(r);
        // Output: 27
        // Working: p++ uses 9 (p->10) + q++ uses 4 (q->5) + --p uses 9 (p->9) - --q uses 4 (q->4) + p uses 9 = 9 + 4 + 9 - 4 + 9 = 27.
    }

    static void ex8() {
        int a = 6;
        int b = 2;
        int c = ++a + b++ - a-- + --b + a;
        System.out.println(c);
        // Output: 10
        // Working: ++a uses 7 (a->7) + b++ uses 2 (b->3) - a-- uses 7 (a->6) + --b uses 2 (b->2) + a uses 6 = 7 + 2 - 7 + 2 + 6 = 10.
    }

    static void ex9() {
        int x = 3;
        int y = 7;
        int z = --y + x++ + y-- + ++x;
        System.out.println(z);
        // Output: 20
        // Working: --y uses 6 (y->6) + x++ uses 3 (x->4) + y-- uses 6 (y->5) + ++x uses 5 (x->5) = 6 + 3 + 6 + 5 = 20.
    }

    static void ex10() {
        int a = 5;
        int b = 6;
        int z = a++ - b-- + ++a;
        System.out.println(z);
        // Output: 6
        // Working: a++ uses 5 (a->6) - b-- uses 6 (b->5) + ++a uses 7 (a->7) = 5 - 6 + 7 = 6.
    }

    static void ex11() {
        int a = 5, b = 3, c = 2, d = 4;
        int result = a++ + --b * c-- - ++a + d++ + b - --d + c;
        System.out.println("Result: " + result);
        // Output: Result: 5
        // Working: a++(5, a->6) + (--b(2, b->2) * c--(2, c->1)) - ++a(7, a->7) + d++(4, d->5) + b(2) - --d(4, d->4) + c(1) = 5 + 4 - 7 + 4 + 2 - 4 + 1 = 5.
    }

    static void ex12() {
        int x = 10, y = 5, z = 3;
        int output = ++x - y++ + z-- * --x + ++z + y * 2 - x-- + y++ - --z;
        System.out.println("Output: " + output);
        // Output: Output: 45
        // Working: ++x(11, x->11) - y++(5, y->6) + (z--(3, z->2) * --x(10, x->10)) + ++z(3, z->3) + (y(6) * 2) - x--(10, x->9) + y++(6, y->7) - --z(2, z->2) = 11 - 5 + 30 + 3 + 12 - 10 + 6 - 2 = 45.
    }

    static void ex13() {
        int p = 6, q = 4, r = 2;
        int result = ++p * q-- + r++ - --q + p-- - r + ++q;
        System.out.println("Result: " + result);
        // Output: Result: 35
        // Working: (++p(7, p->7) * q--(4, q->3)) + r++(2, r->3) - --q(2, q->2) + p--(7, p->6) - r(3) + ++q(3, q->3) = 28 + 2 - 2 + 7 - 3 + 3 = 35.
    }

    static void ex14() {
        int i = 3, j = 5, k = 2;
        int val = i++ + j-- - ++k * i-- + j++ + --i - k--;
        System.out.println("Value: " + val);
        // Output: Value: -1
        // Working: i++(3, i->4) + j--(5, j->4) - (++k(3, k->3) * i--(4, i->3)) + j++(4, j->5) + --i(2, i->2) - k--(3, k->2) = 3 + 5 - 12 + 4 + 2 - 3 = -1.
    }

    static void ex15() {
        int x = 8, y = 2, z = 5;
        int ans = --x + y++ * --z - x-- + ++y - z++ + x;
        System.out.println("Answer: " + ans);
        // Output: Answer: 14
        // Working: --x(7, x->7) + (y++(2, y->3) * --z(4, z->4)) - x--(7, x->6) + ++y(4, y->4) - z++(4, z->5) + x(6) = 7 + 8 - 7 + 4 - 4 + 6 = 14.
    }

    static void ex16() {
        int a = 4, b = 6, c = 3;
        int result = a++ + b-- - --c + ++a * ++b - b + a;
        System.out.println("Result: " + result);
        // Output: Result: 44
        // Working: a++(4, a->5) + b--(6, b->5) - --c(2, c->2) + (++a(6, a->6) * ++b(6, b->6)) - b(6) + a(6) = 4 + 6 - 2 + 36 - 6 + 6 = 44.
    }

    static void ex17() {
        int x = 7, y = 2, z = 4;
        int output = --x + y++ * z-- + ++y - z + x--;
        System.out.println("Output: " + output);
        // Output: Output: 21
        // Working: --x(6, x->6) + (y++(2, y->3) * z--(4, z->3)) + ++y(4, y->4) - z(3) + x--(6, x->5) = 6 + 8 + 4 - 3 + 6 = 21.
    }

    static void ex18() {
        int p = 10, q = 5, r = 2;
        int value = p++ - --q + r++ * --p - q-- + ++r + p;
        System.out.println("Value: " + value);
        // Output: Value: 36
        // Working: p++(10, p->11) - --q(4, q->4) + (r++(2, r->3) * --p(10, p->10)) - q--(4, q->3) + ++r(4, r->4) + p(10) = 10 - 4 + 20 - 4 + 4 + 10 = 36.
    }

    static void ex19() {
        int i = 6, j = 3, k = 2;
        int answer = --i + j++ - ++k * i-- + j - --k + i;
        System.out.println("Answer: " + answer);
        // Output: Answer: -1
        // Working: --i(5, i->5) + j++(3, j->4) - (++k(3, k->3) * i--(5, i->4)) + j(4) - --k(2, k->2) + i(4) = 5 + 3 - 15 + 4 - 2 + 4 = -1.
    }

    static void ex20() {
        int a = 5, b = 2, c = 1;
        int result = ++a + b++ - c-- + a * b - --a - c + ++b;
        System.out.println("Result: " + result);
        // Output: Result: 24
        // Working: ++a(6, a->6) + b++(2, b->3) - c--(1, c->0) + (a(6) * b(3)) - --a(5, a->5) - c(0) + ++b(4, b->4) = 6 + 2 - 1 + 18 - 5 - 0 + 4 = 24.
    }

    static void ex21() {
        int x = 4, y = 3, z = 2;
        int result = x++ + --y * z++ - y + ++z - x;
        System.out.println("Result: " + result);
        // Output: Result: 5
        // Working: x++(4, x->5) + (--y(2, y->2) * z++(2, z->3)) - y(2) + ++z(4, z->4) - x(5) = 4 + 4 - 2 + 4 - 5 = 5.
    }

    static void ex22() {
        int a = 7, b = 1, c = 5;
        int value = --a + b++ - c-- + a * ++b - b + c;
        System.out.println("Value: " + value);
        // Output: Value: 21
        // Working: --a(6, a->6) + b++(1, b->2) - c--(5, c->4) + (a(6) * ++b(3, b->3)) - b(3) + c(4) = 6 + 1 - 5 + 18 - 3 + 4 = 21.
    }

    static void ex23() {
        int p = 9, q = 2, r = 3;
        int out = p-- - ++q + r++ * --p + q - r;
        System.out.println("Out: " + out);
        // Output: Out: 26
        // Working: p--(9, p->8) - ++q(3, q->3) + (r++(3, r->4) * --p(7, p->7)) + q(3) - r(4) = 9 - 3 + 21 + 3 - 4 = 26.
    }

    static void ex24() {
        int i = 8, j = 4, k = 1;
        int ans = ++i - j-- + --k + i * j - k;
        System.out.println("Ans: " + ans);
        // Output: Ans: 32
        // Working: ++i(9, i->9) - j--(4, j->3) + --k(0, k->0) + (i(9) * j(3)) - k(0) = 9 - 4 + 0 + 27 - 0 = 32.
    }

    static void ex25() {
        int a = 3, b = 6, c = 2;
        int result = b++ * --a + c-- - b + ++c + a;
        System.out.println("Result: " + result);
        // Output: Result: 11
        // Working: (b++(6, b->7) * --a(2, a->2)) + c--(2, c->1) - b(7) + ++c(2, c->2) + a(2) = 12 + 2 - 7 + 2 + 2 = 11.
    }

    static void ex26() {
        int x = 5, y = 5, z = 5;
        int output = x-- + y-- * ++z - z + ++x;
        System.out.println("Output: " + output);
        // Output: Output: 34
        // Working: x--(5, x->4) + (y--(5, y->4) * ++z(6, z->6)) - z(6) + ++x(5, x->5) = 5 + 30 - 6 + 5 = 34.
    }

    static void ex27() {
        int p = 2, q = 8, r = 1;
        int calc = ++p + q-- - r++ + p * q - --r;
        System.out.println("Calc: " + calc);
        // Output: Calc: 30
        // Working: ++p(3, p->3) + q--(8, q->7) - r++(1, r->2) + (p(3) * q(7)) - --r(1, r->1) = 3 + 8 - 1 + 21 - 1 = 30.
    }

    static void ex28() {
        int m = 6, n = 3, o = 4;
        int value = m++ * --n + o-- - n + m - o;
        System.out.println("Value: " + value);
        // Output: Value: 18
        // Working: (m++(6, m->7) * --n(2, n->2)) + o--(4, o->3) - n(2) + m(7) - o(3) = 12 + 4 - 2 + 7 - 3 = 18.
    }

    static void ex29() {
        int a = 10, b = 2, c = 3;
        int result = --a + b++ * c-- + a - b + ++c;
        System.out.println("Result: " + result);
        // Output: Result: 24
        // Working: --a(9, a->9) + (b++(2, b->3) * c--(3, c->2)) + a(9) - b(3) + ++c(3, c->3) = 9 + 6 + 9 - 3 + 3 = 24.
    }

    static void ex30() {
        int i = 4, j = 7, k = 2;
        int ans = j-- + ++i - k++ * j + i - --k;
        System.out.println("Ans: " + ans);
        // Output: Ans: 3
        // Working: j--(7, j->6) + ++i(5, i->5) - (k++(2, k->3) * j(6)) + i(5) - --k(2, k->2) = 7 + 5 - 12 + 5 - 2 = 3.
    }

    static void ex31() {
        int x = 11, y = 3, z = 2;
        int result = --x - y++ + z-- * x + y - z;
        System.out.println("Result: " + result);
        // Output: Result: 30
        // Working: --x(10, x->10) - y++(3, y->4) + (z--(2, z->1) * x(10)) + y(4) - z(1) = 10 - 3 + 20 + 4 - 1 = 30.
    }

    static void ex32() {
        int a = 5, b = 5, c = 0;
        int value = a++ + b-- - --c + a * b + c;
        System.out.println("Value: " + value);
        // Output: Value: 34
        // Working: a++(5, a->6) + b--(5, b->4) - --c(-1, c->-1) + (a(6) * b(4)) + c(-1) = 5 + 5 + 1 + 24 - 1 = 34.
    }

    static void ex33() {
        int p = 3, q = 3, r = 3;
        int calc = p + q++ * --r - r + ++q;
        System.out.println("Calc: " + calc);
        // Output: Calc: 12
        // Working: p(3) + (q++(3, q->4) * --r(2, r->2)) - r(2) + ++q(5, q->5) = 3 + 6 - 2 + 5 = 12.
    }

    static void ex34() {
        int m = 8, n = 1, o = 2;
        int result = --m + n-- + o * n + m - o--;
        System.out.println("Result: " + result);
        // Output: Result: 13
        // Working: --m(7, m->7) + n--(1, n->0) + (o(2) * n(0)) + m(7) - o--(2, o->1) = 7 + 1 + 0 + 7 - 2 = 13.
    }

    static void ex35() {
        int a = 12, b = 2, c = 1;
        int ans = b++ + a-- - ++c + b * a;
        System.out.println("Ans: " + ans);
        // Output: Ans: 45
        // Working: b++(2, b->3) + a--(12, a->11) - ++c(2, c->2) + (b(3) * a(11)) = 2 + 12 - 2 + 33 = 45.
    }

    static void ex36() {
        int i = 2, j = 9, k = 3;
        int out = j++ - --i + k-- * j + i - k;
        System.out.println("Out: " + out);
        // Output: Out: 37
        // Working: j++(9, j->10) - --i(1, i->1) + (k--(3, k->2) * j(10)) + i(1) - k(2) = 9 - 1 + 30 + 1 - 2 = 37.
    }

    static void ex37() {
        int x = 7, y = 4, z = 6;
        int result = ++z - y-- + x++ * y - --x;
        System.out.println("Result: " + result);
        // Output: Result: 17
        // Working: ++z(7, z->7) - y--(4, y->3) + (x++(7, x->8) * y(3)) - --x(7, x->7) = 7 - 4 + 21 - 7 = 17.
    }

    static void ex38() {
        int p = 1, q = 10, r = 2;
        int calc = q-- + r++ - ++p + p * q;
        System.out.println("Calc: " + calc);
        // Output: Calc: 28
        // Working: q--(10, q->9) + r++(2, r->3) - ++p(2, p->2) + (p(2) * q(9)) = 10 + 2 - 2 + 18 = 28.
    }

    static void ex39() {
        int a = 3, b = 7, c = 2;
        int result = b * --a + ++b - a + --c;
        System.out.println("Result: " + result);
        // Output: Result: 21
        // Working: (b(7) * --a(2, a->2)) + ++b(8, b->8) - a(2) + --c(1, c->1) = 14 + 8 - 2 + 1 = 21.
    }

    static void ex40() {
        int m = 5, n = 2, o = 3;
        int value = --o + m++ * n-- + m - o + ++n;
        System.out.println("Value: " + value);
        // Output: Value: 18
        // Working: --o(2, o->2) + (m++(5, m->6) * n--(2, n->1)) + m(6) - o(2) + ++n(2, n->2) = 2 + 10 + 6 - 2 + 2 = 18.
    }
}

/*
 * THEORY OF HOW INCREMENT / DECREMENT EXPRESSIONS WORK IN THIS PROGRAM:
 *
 * 1. Left-to-Right Operand Evaluation:
 *    In Java, compound arithmetic expressions (+, -, *) evaluate their operands from
 *    left to right as execution moves across the expression. Every time a variable
 *    is incremented or decremented, its updated value is immediately stored in that
 *    variable and seen by subsequent terms later in the expression.
 *
 * 2. Pre-Increment (++x) and Pre-Decrement (--x):
 *    The variable is modified FIRST (x = x + 1 or x = x - 1), and the NEW (updated)
 *    value is used in the expression.
 *
 * 3. Post-Increment (x++) and Post-Decrement (x--):
 *    The OLD (current) value is used FIRST in the expression, and the variable is
 *    modified AFTERWARD (x = x + 1 or x = x - 1) before moving to the next term.
 *
 * 4. Operator Precedence and Associativity:
 *    - Unary ++ and -- bind tightly to their single operand.
 *    - Multiplicative operator (*) has higher precedence than additive operators (+ and -),
 *      so multiplication is grouped and computed before addition/subtraction.
 *    - + and - have equal precedence and associate left to right.
 *
 * 5. Reading the Working Comments Below:
 *    Each working comment lists each term in left-to-right order, showing:
 *    term(value_used_in_expression, variable->updated_value_after_term),
 *    groups any * multiplication, and then adds/subtracts left to right to get the output.
*/
