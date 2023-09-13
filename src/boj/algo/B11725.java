package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B11725 {
    static int N;
    static ArrayList<Integer>[] adj;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        bfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> Q = new LinkedList<>();

        visit[start] = true;
        Q.add(start);

        while (!Q.isEmpty()) {
            int x = Q.poll();

            for (int y : adj[x]) {
                if (visit[y]) continue;
                arr[y] = x;
                Q.add(y);
                visit[y] = true;
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        adj = new ArrayList[N + 1];
        arr = new int[N + 1];
        visit = new boolean[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();
        for (int i = 1; i <= N - 1; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
