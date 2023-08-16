package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[2000001];
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int x = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (arr[x - num] == 1) count++;

            arr[num]++;
        }

        System.out.println(count);
    }
}
