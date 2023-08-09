package boj.step.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        char[] arr = new char[36];
        for (int i = 0; i < 36; i++) {
            if (i < 10) {
                arr[i] = (char) (i + '0');
            } else {
                arr[i] = (char) (i + 55);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % b);
            n /= b;
        }

        Collections.reverse(list);

        for (Integer m : list) {
            sb.append(arr[m]);
        }

        System.out.println(sb.toString());
    }
}
