package boj.step.twodementionarr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[5];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            line[i] = br.readLine();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (line[j].length() <= i) {
                    continue;
                } else {
                    sb.append(line[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
