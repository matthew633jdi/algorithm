package boj.algo.bruteforce;

import boj.FastReader;

/**
 * The type B 9663.
 * 대표적인 백트래킹 유형
 * 복습 필요
 */
public class B9663 {

    static int n, count;
    static int[] col;

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(count);
    }

    private static void rec_func(int row) {
        if (row == n + 1) {
            count++;
        } else {
            // column
            for (int column = 1; column <= n; column++) {
                boolean possible = true;
                // valid check (row, c)
                for (int i = 1; i <= row-1; i++) {
                    // (i,col[i])
                    if (attackable(row, column, i, col[i])) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    col[row] = column;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    private static boolean attackable(int r1, int c1, int r2, int c2) {
        if (c1 == c2) return true;
        if (r1 - c1 == r2 - c2) return true;
        if (r1 + c1 == r2 + c2) return true;

        return false;
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        col = new int[n + 1];
    }


}
