package boj.step.math1;

import java.util.Scanner;

public class B2869r {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int result = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0) {
            result++;
        }

        System.out.println(result);
    }
}
