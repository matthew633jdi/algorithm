package boj.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int[] stack = new int[100001];
        int point = 0;

        int total = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (num == 0) {
                if (point - 1 >= 0) {
                    total -= stack[point-- -1];
                }
            } else {
                total += num;
                stack[point++] = num;
            }
        }

        System.out.println(total);
    }
}
