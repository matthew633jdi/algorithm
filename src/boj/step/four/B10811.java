package boj.step.four;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제를 좀 잘 읽어야 할 듯
 */
public class B10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int x = a;
            int y = b;

            while ((x < n && y > 0) && x < y) {
                int tmp = 0;

                tmp = arr[x];
                arr[x] = arr[y];
                arr[y] = tmp;

                x++;
                y--;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
