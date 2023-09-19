package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B1389 {
    static int N, M, min, ans;
    static int[] dist;
    static ArrayList<Integer>[] adj;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        for (int i = 1; i <= N; i++) {
            bfs(i);
        }

        System.out.println(ans);
    }

    private static void bfs(int idx) {
        dist = new int[N + 1];
        for (int i = 1; i <= N; i++) dist[i] = -1;

        Queue<Integer> que = new LinkedList<>();

        que.add(idx);
        dist[idx] = 0;

        while (!que.isEmpty()) {
            int x = que.poll();

            for (int y : adj[x]) {
                if (dist[y] != -1) continue;

                que.add(y);
                dist[y] = dist[x] + 1;
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] == -1) continue;
            count += dist[i];
        }

        if (min > count) {
            min = count;
            ans = idx;
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        adj = new ArrayList[N + 1];
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
