package boj.step.four;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num < x) {
                if (i != n - 1) {
                    sb.append(num).append(' ');
                } else {
                    sb.append(num);
                }
            }
        }
        System.out.println(sb);
    }
}
