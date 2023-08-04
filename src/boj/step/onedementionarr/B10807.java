package boj.step.onedementionarr;

import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vArr = new int[201];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            vArr[num + 100]++;
        }

        int v = scanner.nextInt();

        System.out.println(vArr[v + 100]);
    }
}
