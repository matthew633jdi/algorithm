package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(" ");
        System.out.println(words.length);
    }
}
