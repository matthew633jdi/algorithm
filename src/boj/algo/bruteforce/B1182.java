package boj.algo.bruteforce;

import boj.FastReader;

public class B1182 {
    static int n, s, total;
    static int[] arr;
    public static void main(String[] args) {
        input();
        rec_func(1, 0);
        // 진 부분집합
        if (s == 0) total--;

        System.out.println(total);
    }

    // DFS의 모습과 닮아 있음
    private static void rec_func(int k, int v) {
        if (k == n + 1) {
            if (v == s) total++;
        } else {
            // 해당 값 넣기
            rec_func(k + 1, v + arr[k]);
            // 해당 값 안 넣기
            rec_func(k + 1, v);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        s = scan.nextInt();

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = scan.nextInt();
    }
}
