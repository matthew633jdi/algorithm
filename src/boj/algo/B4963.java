package boj.algo;

import boj.FastReader;

public class B4963 {
    static int n, m, count;
    static int[][] map;
    static boolean[][] visit;
    // 사방
    static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        pro();
    }

    private static void pro() {
        FastReader scan = new FastReader();

        while (true) {
            m = scan.nextInt();
            n = scan.nextInt();

            if (n == 0 && m == 0) break;

            map = new int[n][m];
            visit = new boolean[n][m];
            count = 0;

            // map setup
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = scan.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n -1 || ny > m - 1) continue;
            if (map[nx][ny] == 0) continue;
            if (visit[nx][ny]) continue;
            dfs(nx, ny);
        }
    }

}
