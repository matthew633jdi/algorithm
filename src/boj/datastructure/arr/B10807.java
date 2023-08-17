package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int[] arr = new int[201];

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            arr[num + 100]++;
        }

        int v = Integer.parseInt(reader.readLine());

        System.out.println(arr[v + 100]);
    }
}
