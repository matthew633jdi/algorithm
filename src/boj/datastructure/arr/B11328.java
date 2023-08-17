package boj.datastructure.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        StringTokenizer st = null;

        for (int i = 0; i < t; i++) {
            int[] alpha = new int[26];
            st = new StringTokenizer(reader.readLine());

            String result = isSameAlpha(st.nextToken(), st.nextToken()) ? "Possible" : "Impossible";
            System.out.println(result);
        }
    }

    static boolean isSameAlpha(String word, String word2) {
        int[] alpha = new int[26];
        for (int i = 0; i < word.length(); i++) {
            alpha[word.charAt(i) - 'a']++;
            alpha[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0) return false;
        }

        return true;
    }
}
