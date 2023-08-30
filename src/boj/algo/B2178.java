package boj.algo;

import boj.FastReader;

import java.util.LinkedList;

public class B2178 {
    static int n, m;
    static int[][] maze, board;
    static boolean[][] visit;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        bfs(1,1);
    }

    private static void bfs(int x, int y) {
        LinkedList<int[]> que = new LinkedList<>();

        que.add(new int[]{x,y});
        visit[x][y] = true;
        board[1][1] = 1;

        while (!que.isEmpty()) {
            int[] v = que.poll();
            int a = v[0];
            int b = v[1];

            for (int i = 0; i < 4; i++) {
                int ax = a + dx[i];
                int by = b + dy[i];

                if (ax > n || ax < 1 || by > m || by < 1) continue;
                if (maze[ax][by] == 0) continue;
                if (visit[ax][by]) continue;

                board[ax][by] = board[a][b] + 1;
                que.add(new int[]{ax, by});
                visit[ax][by] = true;
            }
        }
        System.out.println(board[n][m]);
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        maze = new int[n + 1][m + 1];
        board = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String line = scan.next();
            for (int j = 1; j <= m; j++) {
                maze[i][j] = line.charAt(j-1) - '0';
            }
        }
    }
}
