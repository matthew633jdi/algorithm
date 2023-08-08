package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] cls = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < cls.length; i++) {
            if (word.contains(cls[i])) {
                word = word.replaceAll(cls[i], "_");
            }
        }

        System.out.println(word.length());
    }
}
