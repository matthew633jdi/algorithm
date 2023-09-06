package boj.algo;

import boj.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class B14502 {
    static int N, M, B, ans;
    static int[][] A, blank;
    static boolean[][] visit;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        A = new int[N + 1][M + 1];
        blank = new int[N * M + 1][2];  // 빈 칸 위치 저장
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) for (int j = 1; j <= M; j++) A[i][j] = scan.nextInt();
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        // 모든 빈 칸 모아두기
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (A[i][j] == 0) {
                    B++;
                    blank[B][0] = i;
                    blank[B][1] = j;
                }
            }
        }

        // 첫 번째에서부터 벽을 세울 수 있는 모든 경우 탐색(완탐)
        dfs(1, 0);
        System.out.println(ans);
    }

    private static void dfs(int idx, int selected_cnt) {
        if (selected_cnt == 3) {
            // 그래프 탐색
            bfs();
            return;
        } else {
            if (idx > B) return;    // 더 이상 세울 수 있는 벽이 없는 상태

            // 벽 세우기
            A[blank[idx][0]][blank[idx][1]] = 1;
            dfs(idx + 1, selected_cnt + 1);

            // 세운 벽 다시 초기화
            A[blank[idx][0]][blank[idx][1]] = 0;
            dfs(idx + 1, selected_cnt);
        }
    }

    // multisource BFS
    private static void bfs() {
        Queue<Integer> que = new LinkedList<>();

        // 시작점이 여러 개, queue에 모두 넣음. 동시에 움직이도록 하는 알고리즘 = Multisource BFS
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                // 매번 돌기 때문에 visit 초기화 필요함
                visit[i][j] = false;
                if (A[i][j] == 2) {
                    // x,y 로 고정된 경우에는 두 개를 넣는 것으로 표현할 수 있음.
                    que.add(i);
                    que.add(j);
                    visit[i][j] = true;
                }
            }
        }

        while (!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 1 || nx > N || ny < 1 || ny > M) continue;
                if (A[nx][ny] != 0) continue;
                if (visit[nx][ny]) continue;

                visit[nx][ny] = true;
                que.add(nx);
                que.add(ny);
            }
        }

        // 탐색 종료된 시점, 안전 영역 넓이 계산
        int cnt = 0;
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= M; j++)
                if (A[i][j] == 0 && !visit[i][j]) cnt++;
        ans = Math.max(ans, cnt);
    }
}

