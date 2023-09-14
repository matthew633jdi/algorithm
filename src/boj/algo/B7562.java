package boj.algo;

import boj.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class B7562 {
    static int L, X, Y, DX, DY;
    static int[][] map;
    static int[][] visit;
    static int[][] dir = {{2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}};

    private static FastReader scan = new FastReader();

    public static void main(String[] args) {
        int t = scan.nextInt();
        while (t-- > 0) {
            input();
            pro();
        }
    }

    private static void pro() {
        bfs();
    }

    private static void bfs() {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                visit[i][j] = 0;
            }
        }

        Queue<Integer> Q = new LinkedList<>();

        Q.add(X);
        Q.add(Y);
        visit[X][Y] = 0;

        while (!Q.isEmpty()) {
            int a = Q.poll();
            int b = Q.poll();

            for (int i = 0; i < 8; i++) {
                int na = a + dir[i][0];
                int nb = b + dir[i][1];

                if (na < 0 || nb < 0 || na >= L || nb >= L) continue;
                if (na == X && nb == Y) continue;
                if (visit[na][nb] != 0) continue;

                visit[na][nb] = visit[a][b] + 1;
                Q.add(na);
                Q.add(nb);
            }
        }

        System.out.println(visit[DX][DY]);
    }

    private static void input() {
        L = scan.nextInt();
        map = new int[L][L];
        visit = new int[L][L];
        X = scan.nextInt();
        Y = scan.nextInt();
        DX = scan.nextInt();
        DY = scan.nextInt();
    }
}
