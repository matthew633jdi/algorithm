package boj.step.primary;

import java.util.Scanner;

public class B10093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();


        if (a == b) {
            System.out.println(0);
        } else {
            if (b > a) {
                long tmp = 0L;
                tmp = a;
                a = b;
                b = tmp;
            }

            System.out.println(a - b - 1);
            for (long i = b + 1; i < a; i++) {
                System.out.printf("%d ",i);
            }
        }
    }
}
