package boj.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B10845_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        LinkedList<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String op = reader.readLine();
            switch (op) {
                case "pop":
                    if (que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que.pop());
                    }
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    System.out.println(que.isEmpty()? "1" : "0");
                    break;
                case "front":
                    if (que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que.peekFirst());
                    }
                    break;
                case "back":
                    if (que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que.peekLast());
                    }
                    break;
                default:
                    que.push(Integer.parseInt(op.split(" ")[1]));
                    break;
            }
        }
    }
}
