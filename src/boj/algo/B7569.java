package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B7569 {
    static int N, M, H;
    static int[][][] box;
    static int[][][] dist;

    static int[][] dirc = {{0, 1, 0}, {0, 0, -1}, {0, -1, 0}, {0, 0, 1},{1, 0, 0}, {-1, 0, 0}};

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    private static void pro() {
        bfs();
        System.out.println(result());
    }

    private static void bfs() {
        Queue<Integer> que = new LinkedList<>();

        // multisourceBFS
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    dist[i][j][k] = -1;
                    if (box[i][j][k] == 1) {
                        que.add(i);
                        que.add(j);
                        que.add(k);
                        dist[i][j][k] = 0;
                    }
                }
            }
        }

        while (!que.isEmpty()) {
            int h = que.poll();
            int n = que.poll();
            int m = que.poll();

            for (int i = 0; i < 6; i++) {
                int nh = h + dirc[i][0];
                int nn = n + dirc[i][1];
                int nm = m + dirc[i][2];

                if (nh < 0 || nn < 0 || nm < 0 || nh >= H || nn >= N || nm >= M) continue;
                if (box[nh][nn][nm] != 0) continue;
                if (dist[nh][nn][nm] != -1) continue;

                que.add(nh);
                que.add(nn);
                que.add(nm);
                dist[nh][nn][nm] = dist[h][n][m] + 1;
            }
        }

    }

    private static int result() {
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        if (dist[i][j][k] == -1) {
                            return -1;
                        }
                        ans = Math.max(ans, dist[i][j][k]);
                    }
                }
            }
        }
        return ans;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        dist = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
    }
}
