package boj.step.primary;

import java.util.Scanner;

public class Tc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        int result = func3(n);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(result);

    }

    static int func3_1(int n) {
        int sqrt = (int)Math.sqrt(n);

        return sqrt * sqrt == n ? 1 : 0;
    }

    /**
     * Func 4 int.
     * O(sqrt n)
     * @param n the n
     * @return the int
     */
    static int func3(int n) {
        for (int i = 1; i * i <= n ; i++) {
            if (i * i == n) {
                return 1;
            }
        }

        return 0;
    }
}
