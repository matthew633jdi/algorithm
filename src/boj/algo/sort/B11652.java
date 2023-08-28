package boj.algo.sort;

import boj.FastReader;

import java.util.Arrays;

public class B11652 {

    static int n;
    static long[] a;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        Arrays.sort(a, 1, n + 1);
        long mode = a[1];
        int modeCnt = 1, curCnt = 1;

        for (int i = 2; i <= n; i++) {
            if (a[i] == a[i - 1]) {
                curCnt++;
            } else {
                curCnt = 1;
            }

            if (curCnt > modeCnt) {
                modeCnt = curCnt;
                mode = a[i];
            }
        }
        System.out.println(mode);
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        a = new long[n + 1];
        for (int i = 1; i <= n; i++) a[i] = scan.nextLong();
    }
}
