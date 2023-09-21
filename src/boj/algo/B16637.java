package boj.algo;

import boj.FastReader;

public class B16637 {

    static int N, max;
    static char[] op;
    static int[] num;
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        rec_func(0, num[0]);
        System.out.println(max);
    }

    private static int cal(int opd1, char op, int opd2) {
        return switch (op) {
            case '+' -> opd1 + opd2;
            case '-' -> opd1 - opd2;
            case '*' -> opd1 * opd2;
            default -> 0;
        };
    }

    private static void rec_func(int k, int val) {
        if (k >= N / 2) {
            max = Math.max(max, val);
            return;
        } else {
            int nValue = cal(val, op[k], num[k + 1]);
            rec_func(k + 1, nValue);

            if (k + 1 >= N / 2)
                return;

            int value = cal(num[k + 1], op[k + 1], num[k + 2]);
            int result = cal(val, op[k], value);
            rec_func(k + 2, result);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        max = Integer.MIN_VALUE;

        num = new int[N / 2 + 1];
        op = new char[N / 2];

        String line = scan.next();
        int opIdx = 0;
        int numIdx = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                num[numIdx++] = line.charAt(i) - '0';
            else
                op[opIdx++] = line.charAt(i);
        }
    }
}
