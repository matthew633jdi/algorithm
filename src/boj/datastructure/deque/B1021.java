package boj.datastructure.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int m = Integer.parseInt(line.split(" ")[1]);

        int count = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) deque.offer(i);    // 50

        StringTokenizer st = new StringTokenizer(reader.readLine());

        // 50
        for (int i = 0; i < m; i++) {
            int idx = Integer.parseInt(st.nextToken());
            Deque<Integer> lDeque = new LinkedList<>(deque);
            int lCount = 0;

            // 50
            while (lDeque.peekFirst() != idx) {
                lDeque.offerLast(lDeque.pollFirst());
                lCount++;
            }
            lDeque.pollFirst();

            Deque<Integer> rDeque = new LinkedList<>(deque);
            int rCount = 0;
            // 50
            while (rDeque.peekFirst() != idx) {
                rDeque.offerFirst(rDeque.pollLast());
                rCount++;
            }
            rDeque.pollFirst();

            if (lCount < rCount) {
                count += lCount;
                deque = lDeque;
            } else {
                count += rCount;
                deque = rDeque;
            }
        }

        System.out.println(count);
    }
}
