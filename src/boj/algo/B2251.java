package boj.algo;

import boj.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class B2251 {
    static int[] Limit;
    static boolean[] possible;
    static boolean[][][] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        bfs(0, 0, Limit[2]);
        for (int i = 0; i <= 200; i++) {
            if (possible[i]) sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

    private static void bfs(int x1, int x2, int x3) {
        Queue<State> que = new LinkedList<>();
        visit[x1][x2][x3] = true;
        que.add(new State(new int[]{x1, x2, x3}));

        while (!que.isEmpty()) {
            State st = que.poll();
            if (st.X[0] == 0) possible[st.X[2]] = true;
            for (int from = 0; from < 3; from++) {
                for (int to = 0; to < 3; to++) {
                    if (from == to) continue;

                    State nxt = st.move(from, to, Limit);

                    if (!visit[nxt.X[0]][nxt.X[1]][nxt.X[2]]) {
                        visit[nxt.X[0]][nxt.X[1]][nxt.X[2]] = true;
                        que.add(nxt);
                    }
                }
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        Limit = new int[3];
        for (int i = 0; i < 3; i++) Limit[i] = scan.nextInt();
        visit = new boolean[205][205][205];
        possible = new boolean[205];
    }
}

class State {
    int[] X;

    public State(int[] _X) {
        X = new int[3];
        for (int i = 0; i < 3; i++) X[i] = _X[i];
    }

    State move(int from, int to, int[] Limit) {
        int[] nX = new int[]{X[0], X[1], X[2]};
        if (X[from] + X[to] <= Limit[to]) {
            nX[to] = nX[from] + nX[to];
            nX[from] = 0;
        } else {
            nX[from] -= Limit[to] - nX[to];
            nX[to] = Limit[to];
        }
        return new State(nX);
    }
}
