package boj.step.onedementionarr;

import java.util.Scanner;

public class B10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt() -1;
            int y = scanner.nextInt() -1;
            int z = scanner.nextInt();

            for (int j = x; j <= y; j++) {
                arr[j] = z;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
