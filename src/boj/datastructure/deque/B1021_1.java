package boj.datastructure.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int m = Integer.parseInt(line.split(" ")[1]);

        int count = 0;
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) deque.offer(i);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int halfIdx = 0;

            int idx = deque.indexOf(num);

            if (deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2 -1;
            } else {
                halfIdx = deque.size() / 2;
            }

            if (idx <= halfIdx) {
                while (deque.peekFirst() != num) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            } else {
                while (deque.peekFirst() != num) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }
}
