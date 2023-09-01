package boj.algo;

import boj.FastReader;

import java.util.ArrayList;

public class B11724 {
    static int n, m;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (visit[i]) continue;
            count++;
            dfs(i);
        }

        System.out.println(count);
    }

    private static void dfs(int start) {
        visit[start] = true;

        for (int y : adj[start]) {
            if (visit[y]) continue;

            dfs(y);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();

        adj = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) adj[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }
    }

}
