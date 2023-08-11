package boj.step.bigO;

import java.util.Scanner;

public class B24267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n * (n -1) * (n -2) / 6);
        System.out.println(3);
    }
}
