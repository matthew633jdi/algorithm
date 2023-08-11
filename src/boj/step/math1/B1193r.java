package boj.step.math1;

import java.util.Scanner;

public class B1193r {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int lineCount = 1, total = 0;

        while (true) {
            if (x <= total + lineCount) {
                if (lineCount % 2 == 1) {
                    int a = lineCount - (x - total - 1);
                    int b = x - total;
                    System.out.println(a + "/"+ b);
                    break;
                } else {
                    int a = x - total;
                    int b = lineCount - (x - total - 1);
                    System.out.println(a + "/" + b);
                    break;
                }
            } else {
                total += lineCount;
                lineCount++;
            }
        }
    }
}
