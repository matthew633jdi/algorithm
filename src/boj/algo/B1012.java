package boj.algo;

import boj.FastReader;

public class B1012 {
    static int t, n, m, k, count;
    static int[][] board;
    static boolean[][] visit;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    private static FastReader scan = new FastReader();

    public static void main(String[] args) {
        t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            input();
            count = 0;
            pro();
        }
    }

    private static void pro() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 빈 곳이거나 이미 방문한 곳은 볼 필요 없음
                if(board[i][j] == 0 || visit[i][j]) continue;
                
                // 시작점 찾기
                dfs(i, j);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx > n -1 || ny < 0 || ny > m -1) continue;
            if (visit[nx][ny] || board[nx][ny] == 0) continue;

            dfs(nx, ny);
        }

    }

    private static void input() {
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();

        board = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < k; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            board[x][y] = 1;
        }
    }
}
