package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        String line = br.readLine();
//        int total = 0;
//        if (line.length() == n) {
//            for (int i = 0; i < n; i++) {
//                total += line.charAt(i) - 48;
//            }
//        }
//
//        System.out.println(total);

        br.readLine();

        int total = 0;

        for (byte value : br.readLine().getBytes()) {
            total += value - '0';
        }

        System.out.println(total);
    }
}
