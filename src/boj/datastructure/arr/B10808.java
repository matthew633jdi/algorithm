package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int[] alpaArr = new int[26];

        for (char c : word.toCharArray()) {
            alpaArr[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.printf("%d ", alpaArr[i]);
        }
    }
}
