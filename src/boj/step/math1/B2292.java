package boj.step.math1;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        if (n != 1) {
            int startPoint = 2;
            while (true) {
                if (n >= startPoint && n < startPoint + (6 * i)) {
                    break;
                } else {
                    startPoint += 6 * i;
                }
                i++;
            }
            System.out.println(i + 1);
        } else {
            System.out.println(i);
        }
    }
}
