package boj.step.three;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            result += a * b;
        }

        System.out.println(x == result ? "Yes" : "No");
    }
}
