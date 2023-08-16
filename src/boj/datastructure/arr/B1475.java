package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[10];

        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) continue;

            if (arr[i] > max) max = arr[i];
        }


//        int num = arr[6] + arr[9];
//        int x = (num) % 2 == 0 ? num /2 : num /2 + 1;

        int x = (arr[6] + arr[9] + 1) / 2;

        System.out.println(Math.max(max, x));
    }
}
