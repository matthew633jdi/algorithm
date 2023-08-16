package boj.step.primary;

import java.util.Scanner;

public class B10804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[21];

        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            swapRange(arr, x, y);
        }

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }


    static void swapRange(int[] arr, int a, int b) {
        while (a < b) {
            int tmp = 0;
            tmp = arr[a];
            arr[a++] = arr[b];
            arr[b--] = tmp;
        }
    }
}
