package boj.step.primary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        char[] arr = {'D', 'C', 'B', 'A', 'E'};

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int total = 0;

            while (st.hasMoreTokens()) {
                total += st.nextToken().charAt(0) - '0';
            }
            System.out.println(arr[total]);
        }
    }
}
