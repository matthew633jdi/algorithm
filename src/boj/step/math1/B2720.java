package boj.step.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] z = new int[]{25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] ans = new int[4];
            for (int j = 0; j < z.length; j++) {
                ans[j] = c / z[j];
                c = c % z[j];
            }

            for (int j = 0; j < z.length; j++) {
                System.out.printf("%d ", ans[j]);
            }
            System.out.println();
        }
        
    }
}
