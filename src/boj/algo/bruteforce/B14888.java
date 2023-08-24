package boj.algo.bruteforce;

import boj.FastReader;

public class B14888 {
    static int N, MAX, MIN;
    static int[] numArr, opArr;
    public static void main(String[] args) {
        input();
        rec_func(1, numArr[1]);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    static int calculator(int oprand1, int op, int operad2) {
        if (op == 1)
            return oprand1 + operad2;
        else if (op == 2)
            return oprand1 - operad2;
        else if (op == 3)
            return oprand1 * operad2;
        else
            return oprand1 / operad2;
    }

    private static void rec_func(int k, int value) {
        if (k == N) {
            MAX = Math.max(MAX, value);
            MIN = Math.min(MIN, value);
        } else {
            for (int i = 1; i <= 4; i++) {
                    if (opArr[i] == 0) continue;
                    opArr[i]--;
                    rec_func(k + 1, calculator(value, i, numArr[k + 1]));
                    opArr[i]++;
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        MAX = Integer.MIN_VALUE;
        MIN = Integer.MAX_VALUE;

        numArr = new int[N + 1];
        for (int i = 1; i <= N; i++) numArr[i] = scan.nextInt();

        opArr = new int[5];
        for (int i = 1; i <= 4; i++) opArr[i] = scan.nextInt();
    }
}
