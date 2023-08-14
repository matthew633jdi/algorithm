package boj.step.primary;

import java.util.Scanner;

public class Tc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }

        System.out.println(total);
    }
}
