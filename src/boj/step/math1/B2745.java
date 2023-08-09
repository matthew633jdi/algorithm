package boj.step.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int total = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            int num = (int) Math.pow(b, (n.length() -1 - i));
            if (n.charAt(i) - '0' < 0 || n.charAt(i) - '0' > 9) {
                total += (n.charAt(i) - 'A' + 10) * num;
            } else {
                total += (n.charAt(i) - '0' ) * num;
            }
        }

        System.out.println(total);
    }
}
