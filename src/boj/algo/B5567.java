package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B5567 {
    static int N, M;
    static int[] dist;
    static ArrayList<Integer>[] adj;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    private static void pro() {
        bfs();
    }

    private static void bfs() {
        for (int i = 1; i <= N; i++) dist[i] = -1;
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        dist[1] = 0;

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
            if (dist[i] == 1 || dist[i] == 2) count++;
        }

        System.out.println(count);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        dist = new int[N + 1];
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
    }
}
