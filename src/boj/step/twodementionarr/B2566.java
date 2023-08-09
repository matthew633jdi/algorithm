package boj.step.twodementionarr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int idx_x = -1;
        int idx_y = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(s[j]);
                arr[i][j] = num;

                if (max < num) {
                    max = num;
                    idx_x = i;
                    idx_y = j;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", idx_x+1, idx_y+1);
    }
}
