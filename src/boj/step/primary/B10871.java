package boj.step.primary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The type B 10871.
 * input : n x ( 1 <= n , x <= 10,000)
 * n개의 수열
 *
 * output : x보다 작은 수를 입력받은 순서대로 공백으로 구분하여 출력
 */
public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // O(N)
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num < x) {
                sb.append(num).append(' ');
            }
        }

        System.out.println(sb.toString());
    }
}
