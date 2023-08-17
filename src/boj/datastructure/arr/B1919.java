package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();
        String word2 = reader.readLine();

        int[] alpha = new int[26];

        for (int i = 0; i < word.length(); i++) {
            alpha[word.charAt(i) - 'a']++;
            alpha[word2.charAt(i) - 'a']--;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            count += Math.abs(alpha[i]);
        }

        System.out.println(count);
    }
}
