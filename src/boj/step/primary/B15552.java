package boj.step.primary;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());

        StringTokenizer st = null;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            writer.write(a + b + "\n");
        }


        reader.close();
        writer.flush();
        writer.close();
    }
}
