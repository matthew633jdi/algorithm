package boj.step.twodementionarr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2563r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int total = 0;
        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            for (int j = x; j <= x + 9; j++) {
                for (int k = y; k <= y + 9; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }

        }

        System.out.println(total);

    }

}
