package boj.datastructure.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10866 {

    public static final int M = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] deque = new int[2 * M + 1];
        int head = M;
        int tail = M + 1;

        for (int i = 0; i < n; i++) {
            String op = reader.readLine();
            switch (op) {
                case "size":
                    System.out.println(tail - head -1);
                    break;
                case "empty":
                    System.out.println(tail - head -1 == 0 ? "1": "0");
                    break;
                case "front":
                    if (tail == head -1 ) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque[head + 1]);
                    }
                    break;
                case "back":
                    if (tail == head + 1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque[tail - 1]);
                    }
                    break;
                case "pop_front":
                    if (tail == head + 1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque[head + 1]);
                        head++;
                    }
                    break;
                case "pop_back":
                    if (tail == head +1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque[tail - 1]);
                        tail--;
                    }
                    break;
                default:
                    if (op.charAt(5) == 'f') {
                        deque[head--] = Integer.parseInt(op.split(" ")[1]);
                    } else {
                        deque[tail++] = Integer.parseInt(op.split(" ")[1]);
                    }
                    break;
            }
        }
    }
}
