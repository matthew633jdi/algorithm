package boj.step.two;

import java.util.Scanner;

public class B2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        int result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;

        System.out.println(result);
    }
}
