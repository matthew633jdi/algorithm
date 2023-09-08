package boj.algo;

import boj.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class B3055 {
    static int R, C;
    static String[] a;
    static int[][] dist_w, dist_s;
    static int[][] dirc = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };
    static boolean[][] visit;

    private static void input() {
        FastReader scan = new FastReader();
        R = scan.nextInt();
        C = scan.nextInt();
        a = new String[R];

        for (int i = 0; i < R; i++) {
            a[i] = scan.nextLine();
        }
        visit = new boolean[R][C];
        dist_w = new int[R][C];
        dist_s = new int[R][C];
    }


    private static void pro() {
        // 물이 거쳐가는 시간
        bfs_w();
        // 고슴도치가 거쳐가는 시간
        bfs_s();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (a[i].charAt(j) == 'D') {
                    if (dist_s[i][j] == -1) System.out.println("KAKTUS");
                    else System.out.println(dist_s[i][j]);
                }
            }
        }
    }

    private static void bfs_w() {
        Queue<Integer> Q = new LinkedList<>();
        // multisource BFS
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dist_w[i][j] = -1;
                visit[i][j] = false;
                if (a[i].charAt(j) == '*') {
                    Q.add(i);
                    Q.add(j);
                    dist_w[i][j] = 0;
                    visit[i][j] = true;
                }
            }
        }

        while (!Q.isEmpty()) {
            int x = Q.poll();
            int y = Q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dirc[i][0];
                int ny = y + dirc[i][1];
                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (a[nx].charAt(ny) != '.') continue;
                if (visit[nx][ny]) continue;

                Q.add(nx);
                Q.add(ny);
                visit[nx][ny] = true;
                dist_w[nx][ny] = dist_w[x][y] + 1;
            }
        }
    }

    private static void bfs_s() {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dist_s[i][j] = -1;
                visit[i][j] = false;
                if (a[i].charAt(j) == 'S') {
                    Q.add(i);
                    Q.add(j);
                    dist_s[i][j] = 0;
                    visit[i][j] = true;
                }
            }
        }

        while (!Q.isEmpty()) {
            int x = Q.poll();
            int y = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dirc[i][0];
                int ny = y + dirc[i][1];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;   // range
                if (a[nx].charAt(ny) != '.' && a[nx].charAt(ny) != 'D') continue;   // 갈 수 있는 곳
                if (dist_w[nx][ny] != -1 && dist_w[nx][ny] <= dist_s[x][y] + 1) continue;   // core
                if (visit[nx][ny]) continue;    // 중복 제거

                Q.add(nx);
                Q.add(ny);
                visit[nx][ny] = true;
                dist_s[nx][ny] = dist_s[x][y] + 1;
            }
        }
    }
    public static void main(String[] args) {
        input();
        pro();
    }

}
