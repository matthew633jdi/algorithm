package boj.step.primary;

import java.util.Scanner;

public class B2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int total = 0;

        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 1) {
                total += num;

                if (num < min) {
                    min = num;
                }
            }
        }

        if (total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}
