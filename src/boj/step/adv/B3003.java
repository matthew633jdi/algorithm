package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int[] arr = {1, 1, 2, 2, 2, 8};
        String[] num = br.readLine().split(" ");

        for (int i = 0; i < num.length; i++) {
            sb.append(arr[i] - Integer.parseInt(num[i])).append(' ');
        }

        System.out.println(sb.toString());
    }
}
