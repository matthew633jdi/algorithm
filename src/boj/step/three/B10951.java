package boj.step.three;

import java.util.Scanner;

public class B10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
    }
}
