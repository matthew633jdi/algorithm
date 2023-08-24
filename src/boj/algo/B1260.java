package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class B1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nmv = reader.readLine().split(" ");
        int n = Integer.parseInt(nmv[0]);
        int m = Integer.parseInt(nmv[1]);
        int v = Integer.parseInt(nmv[2]);

        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        boolean[] visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] ee = reader.readLine().split(" ");
            int e1 = Integer.parseInt(ee[0]);
            int e2 = Integer.parseInt(ee[1]);

            adj[e1].add(e2);
            adj[e2].add(e1);
        }

        StringBuilder sb = new StringBuilder();

        // bfs
        LinkedList<Integer> que = new LinkedList<>();

        que.add(v);
        visit[v] = true;

        while (!que.isEmpty()) {
            int x = que.poll();

            sb.append(x).append(' ');
            for (int y : adj[x]) {
                if (visit[y]) continue;

                que.add(y);
                visit[y] = true;
            }
        }
        System.out.println(sb.toString());
    }
}
