package boj.step.loop;

import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int t = n / 4;

        for (int i = 0; i < t; i++) {
            System.out.printf("%s ", "long");
        }

        System.out.print("int");
    }
}
