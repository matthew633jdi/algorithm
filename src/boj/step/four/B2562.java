package boj.step.four;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
