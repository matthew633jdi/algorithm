package boj.step.onedementionarr;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] arr = new double[n];

        double max = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();

            if (arr[i] > max) {
                max = arr[i];
            }
        }


        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += arr[i] / max * 100;
        }

        System.out.println(avg / n);
    }
}
