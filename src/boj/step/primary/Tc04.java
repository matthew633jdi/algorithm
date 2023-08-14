package boj.step.primary;

import java.util.Scanner;

public class Tc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(func4_1(scanner.nextInt()));
    }

    static int func4(int n) {
        int i =0;
        for (; (int)Math.pow(2, i) <= n; i++) {}

        return (int) Math.pow(2, i -1);
    }

    /**
     * Func 4 1 int.
     * O(log N)
     * @param n the n
     * @return the int
     */
    static int func4_1(int n) {
        int val = 1;
        while (2 * val <= n) {
            val *= 2;
        }

        return val;
    }
}
