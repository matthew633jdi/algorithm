package boj.step.math1;

import java.util.Scanner;

public class B2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = 2;

        for (int i = 0; i < n; i++) {
            x += (int)Math.pow(2, i);
        }

        System.out.println((int)Math.pow(x,2));
    }
}
