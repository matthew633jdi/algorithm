package boj.step.condition;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m - 45 < 0) {
            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
            m = 60 + m - 45;
        } else {
            m -= 45;
        }

        System.out.println(h + " " + m);
    }
}
