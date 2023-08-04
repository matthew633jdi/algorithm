package boj.step.ioop;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int tmp = b % 10;
        System.out.println(a * tmp);    // (3)

        tmp = b / 10 % 10;
        System.out.println(a * tmp);    // (4)

        tmp = b /100 % 10;
        System.out.println(a * tmp);    // (5)

        System.out.println(a * b);  // (6)
    }
}
