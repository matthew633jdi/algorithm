package boj.algo;

import boj.FastReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class B1260a {
    static int n, m, v;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        visit = new boolean[n + 1];
        dfs(v);
        sb.append('\n');
        visit = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
    }

    // v에서 시작해서 갈 수 있는 정점 모두 탐색하기
    private static void bfs(int v) {
        LinkedList<Integer> que = new LinkedList<>();

        // v는 방문 가능한 정점이기에 que에 넣음
        que.add(v);
        // v를 갈 수 있다고 표시!!
        visit[v] = true;

        // 더 확인할 수 있는 정점이 없으면 정지
        while (!que.isEmpty()) {
            int x = que.poll();
            
            sb.append(x).append(' ');
            // 해당 정점에서 방문가능한 정점 모두 확인
            for (int y : adj[x]) {
                // x에서 y를 갈 수는 있지만, 이미 탐색한 점이면 무시
                if (visit[y]) continue;

                // y를 갈 수 있으니 que에 추가하고, visit 처리
                que.add(y);
                visit[y] = true;
            }
        }
    }

    // v를 갈 수 있다는 걸 알고 방문한 상태
    private static void dfs(int v) {

        // v를 방문!!!
        visit[v] = true;
        sb.append(v).append(' ');

        // v에서 갈 수 있는 정점 모두 방문
        for (int y : adj[v]) {
            // y를 이미 갈 수 있다는 사실을 안다면, 굳이 안감
            if (visit[y]) continue;
            
            // y에서 갈 수 있는 곳들 확인
            dfs(y);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        v = scan.nextInt();

        adj = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }

        // sort
        for (int i = 1; i <= n; i++) {
            Collections.sort(adj[i]);
        }
    }
}
