package boj.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type B 10845.
 * B 18258 과 답이 동일한 듯
 */
public class B10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] que = new int[10001];
        int head = 1;
        int tail = 1;

        for (int i = 0; i < n; i++) {
            String op = reader.readLine();
            switch (op) {
                case "pop":
                    if (tail - head == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que[head++]);
                    }
                    break;
                case "size":
                    System.out.println(tail - head);
                    break;
                case "empty":
                    System.out.println(tail - head == 0 ? "1" : "0");
                    break;
                case "front":
                    if (tail - head == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que[head]);
                    }
                    break;
                case "back":
                    if (tail - head == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que[tail -1]);
                    }
                    break;
                default:
                    que[tail++] = Integer.parseInt(op.split(" ")[1]);
                    break;
            }
        }
    }
}
