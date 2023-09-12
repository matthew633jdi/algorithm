package boj.algo;

import boj.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class B11403 {
    static int N;
    static boolean[] visit;
    static int[][] adj;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        visit = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            bfs(i);
        }
        System.out.println(sb);
    }

    private static void bfs(int start) {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) visit[i] = false;

        Q.add(start);
        visit[start] = false;

        while (!Q.isEmpty()) {
            int x = Q.poll();

            for (int y = 1; y <= N; y++) {
                if (adj[x][y] == 0) continue;
                if (visit[y]) continue;

                Q.add(y);
                visit[y] = true;
            }
        }

        for (int j = 1; j <= N; j++) {
            sb.append(visit[j] ? "1" : "0").append(' ');
        }
        sb.append("\n");
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        adj = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
                adj[i][j] = scan.nextInt();
    }
}
