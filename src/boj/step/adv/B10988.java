package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        byte[] bytes = word.getBytes();
        int x = 0;
        int y = bytes.length - 1;
        boolean isSame = true;

        while (x < y) {
            if (bytes[x++] != bytes[y--]) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame ? "1" : "0");
    }
}
