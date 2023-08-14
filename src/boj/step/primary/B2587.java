package boj.step.primary;

import java.util.Arrays;
import java.util.Scanner;

public class B2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int avg = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
            avg += num;
        }

        Arrays.sort(arr);
        System.out.println(avg / 5);
        System.out.println(arr[2]);
    }
}
