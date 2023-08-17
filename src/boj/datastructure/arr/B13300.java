package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][7];

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            arr[line[0].charAt(0) - '0'][line[1].charAt(0) - '0']++;
        }

        int total = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
                total += arr[i][j] % k == 0 ? arr[i][j] / k : arr[i][j] / k + 1;
            }
        }

        System.out.println(total);
    }
}
