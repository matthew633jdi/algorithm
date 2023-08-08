package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < t; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26];
            boolean isGroup = true;

            for (int j = 0; j < word.length(); j++) {
                int idx = word.charAt(j) - 'a';
                if (check[idx]) {
                    if (word.charAt(j) != word.charAt(j - 1)) {
                        isGroup = false;
                        break;
                    }
                } else {
                    check[idx] = true;
                }
            }

            if (isGroup) count++;

        }

        System.out.println(count);
    }
}
