package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();

        int[] alph = new int[26];
        int max = Integer.MIN_VALUE;
        boolean isDupl = false;
        char fc = ' ';

        for (char c : word.toCharArray()) {
            alph[c - 'a']++;
            if (max == alph[c - 'a']) {
                isDupl = true;
            } else if (max < alph[c - 'a']) {
                isDupl = false;
                max = alph[c - 'a'];
                fc = c;
            }
        }

        if (isDupl) {
            System.out.println("?");
        } else {
            System.out.println((char) (fc - 32));
        }

    }
}
