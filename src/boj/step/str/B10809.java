package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] alpha = new int[26];

        for (int i = 0; i < alpha.length; i++) {
            char ch = (char) ('a' + i);

            alpha[i] = word.indexOf(ch);
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%s ", alpha[i]);
        }
    }
}
