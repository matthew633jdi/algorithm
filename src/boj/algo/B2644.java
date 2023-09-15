package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B2644 {
    static int N, P, C, M;
    static ArrayList<Integer>[] adj;

//    static boolean[] visit;
    static int[] dist;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        dist = new int[N + 1];
        bfs(P);
        System.out.println(dist[C]);
    }

    private static void bfs(int start) {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) dist[i] = -1;

        Q.add(start);
        dist[start] = 0;

        while (!Q.isEmpty()) {
            int x = Q.poll();

            for (int y : adj[x]) {
                if (dist[y] != -1) continue;

                Q.add(y);
                dist[y] = dist[x] + 1;
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        P = scan.nextInt();
        C = scan.nextInt();
        M = scan.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
