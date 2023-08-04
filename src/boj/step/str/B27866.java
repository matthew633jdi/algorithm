package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27866 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String word = br.readLine();
            int idx = Integer.parseInt(br.readLine()) -1;

            System.out.println(word.charAt(idx));
        }
    }
}
