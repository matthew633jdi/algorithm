package boj.algo.bruteforce;

import boj.FastReader;

import java.io.IOException;

public class B15650 {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }

    /**
     * Recurrence Function
     * @param k
     * k == M + 1, 조건에 맞는 탐색 한 번 성공
     * 아니면, k번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도
     */
    private static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand = selected[k-1] + 1; cand <= N; cand++) {
                selected[k] = cand;

                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    private static void input() throws IOException {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }
}
