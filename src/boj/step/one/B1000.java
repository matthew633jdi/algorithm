package boj.step.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 + num2);
        // B1001
//         System.out.println(num1 - num2);
        // B10998
//         System.out.println(num1 * num2);
        // B1008
//         System.out.println(num1 / num2);
        // B10869
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);
//        System.out.println(num1 % num2);
    }
}
