package boj.step.math1;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 0;

        if (n != 1) {
            int i = 1;
            int total = 2;
            while (true) {
                if (n >= total && n <= total + (6 * i)) {
                    System.out.println(total);
                    System.out.println(total + (6 * i));
                    result = i;
                    break;
                } else {
                    total += 6 * i + 1;
                }
                i++;
            }
        }

        System.out.println(result);
    }
}
