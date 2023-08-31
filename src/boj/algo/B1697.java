package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;

public class B1697 {
    static int n, k, min;
    static ArrayList<Integer>[] adj;
    public static final int MAX_RANGE = 100_000;
    static boolean[] visit = new boolean[MAX_RANGE + 1];
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        find(n);
        System.out.println(min);
    }

    private static void find(int start) {
        LinkedList<int[]> que = new LinkedList<>();

        que.add(new int[]{start, 0});
        visit[start] = true;

        while (!que.isEmpty()) {
            int[] elem = que.poll();
            int nX = elem[0];
            int nC = elem[1];
            if (nX == k) {
                min = nC;
                break;
            }

            for (int y : adj[nX]) {
                if (visit[y]) continue;

                que.add(new int[]{y, nC + 1});
                visit[y] = true;
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        k = scan.nextInt();
        min = Integer.MAX_VALUE;
        adj = new ArrayList[MAX_RANGE + 1];

        for (int i = 0; i <= MAX_RANGE; i++) adj[i] = new ArrayList<>();
        for (int i = 1; i < MAX_RANGE; i++) {
            adj[i].add(i - 1);
            adj[i].add(i + 1);
            if (i * 2 <= MAX_RANGE) adj[i].add(i * 2);
        }

        adj[0].add(1);
        adj[MAX_RANGE].add(MAX_RANGE -1);
    }
}
