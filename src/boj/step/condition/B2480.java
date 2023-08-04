package boj.step.condition;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = 0;

        if (a == b && a == c) {
            result = 10_000 + a * 1_000;
        } else if (a != b && a != c && b != c) {
            int max = Math.max(a, b);
            max = Math.max(max, c);

            result = max * 100;
        } else {
            int common = 0;
            if (a == b || a == c) {
                common = a;
            } else {
                common = b;
            }

            result = 1_000 + common * 100;
        }

        System.out.println(result);
    }
}
