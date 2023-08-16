package boj.step.primary;

import java.util.Scanner;

public class B1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int yTotal = 0, mTotal = 0;

        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();

            yTotal += (num / 30 + 1) * 10;
            mTotal += (num / 60 + 1) * 15;
        }

        if (yTotal == mTotal) {
            System.out.printf("Y M %d",yTotal);
        } else {
            System.out.printf("%s", yTotal < mTotal ? "Y " + yTotal : "M " + mTotal);
        }
    }
}
