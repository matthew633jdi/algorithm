package boj.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] stack = new int[10001];
        int point = 0;

        for (int i = 0; i < n; i++) {
            String op = reader.readLine();
            switch (op) {
                case "pop":
                    if (point > 0 && stack[point - 1] != 0) {
                        System.out.println(stack[point-- -1]);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(point);
                    break;
                case "empty":
                    System.out.println(point == 0 ? 1 : 0);
                    break;
                case "top":
                    if (point > 0 && stack[point - 1] != 0) {
                        System.out.println(stack[point -1]);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                default:
                    stack[point++] = Integer.parseInt(op.split(" ")[1]);
                    break;
            }
        }

    }
}
