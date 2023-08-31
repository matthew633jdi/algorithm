package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;

public class B1697a {
    static int n, k;
    static int[] dist;
    public static final int MAX_RANGE = 100_000;
    static boolean[] visit;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        find(n);
        System.out.println(dist[k]);
    }

    private static void find(int start) {
        LinkedList<Integer> que = new LinkedList<>();

        que.add(n);
        visit[n] = true;
        dist[n] = 0;

        while (!que.isEmpty()) {
            int x = que.poll();

            if (x - 1 >= 0 && !visit[x - 1]) {
                visit[x - 1] = true;
                dist[x - 1] = dist[x] + 1;
                que.add(x - 1);
            }
            if (x + 1 <= MAX_RANGE && !visit[x + 1]) {
                visit[x + 1] = true;
                dist[x + 1] = dist[x] + 1;
                que.add(x + 1);
            }
            if (x * 2 <= MAX_RANGE && !visit[x * 2]) {
                visit[x * 2] = true;
                dist[x * 2] = dist[x] + 1;
                que.add(x * 2);
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        k = scan.nextInt();
        dist = new int[MAX_RANGE + 1];
        visit = new boolean[MAX_RANGE + 1];
    }
}
