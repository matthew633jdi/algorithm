package boj.algo;

import boj.FastReader;

public class B3184 {
    static int R, C, totalSheep, totalWolf, sheep, wolf;
    static String[] a;
    static boolean[][] visit;
    static int[][] dir = {{1,0}, {0, 1}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (a[i].charAt(j) != '#' && !visit[i][j]) {
                    sheep = 0;
                    wolf = 0;
                    dfs(i, j);
                    if (sheep > wolf) totalSheep += sheep;
                    else totalWolf += wolf;
                }
            }
        }

        System.out.println(totalSheep + " " + totalWolf);
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        if (a[x].charAt(y) == 'o') sheep += 1;
        if (a[x].charAt(y) == 'v') wolf += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if (a[nx].charAt(ny) == '#') continue;
            if (visit[nx][ny]) continue;

            dfs(nx, ny);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        R = scan.nextInt();
        C = scan.nextInt();
        a = new String[R];
        visit = new boolean[R][C];

        for (int i = 0; i < R; i++) a[i] = scan.nextLine();
    }
}
