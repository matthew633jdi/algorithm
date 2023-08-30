package boj.algo;

import boj.FastReader;

public class B1018 {
    static int n, m, min;
    static boolean[][] board;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean TF = board[x][y];   // 첫 번째 칸의 색

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                // 올바른 색이 아닐 경우 count 증가
                if (board[i][j] != TF) count++;
                
                // 다음 칸은 색이 바껴 변경
                TF = !TF;
            }
            TF = !TF;
        }

        // 첫 번째 칸을 기준으로 색칠할 갯수(count)
        // 첫 번째 칸의 색의 반대되는 색을 기준으로 갯수(8*8 - count) 중 최솟값
        count = Math.min(64 - count, count);

        min = Math.min(min, count);
    }

    private static void pro() {
        int nRow = n - 7;
        int mCol = m - 7;
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        board = new boolean[n][m];
        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            for (int j = 0; j < m; j++) {
                char ch = line.charAt(j);
                board[i][j] = ch == 'W';
            }
        }
    }
}
