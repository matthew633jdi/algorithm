package boj.datastructure.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1158r {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            que.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (que.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                que.offer(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }

        sb.append(que.poll()).append(">");
        System.out.println(sb);

    }
}
