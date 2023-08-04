package boj.step.condition;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b + c > 60) {
            int d = (b + c) / 60;

            b = b + c - 60 * d;

            if (a + d >= 24) {
                a = a + d - 24;
            } else {
                a += d;
            }
        } else {
            b = b + c;
        }

        System.out.println(a + " " + b);
    }
}
