package boj.algo;

import boj.FastReader;

/**
 * The type B 6603.
 * recursive, back-tracking, dfs
 */
public class B6603 {
    static int k;
    static int[] arr, selected;

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        while (true) {
            k = scan.nextInt();
            if (k == 0) break;

            arr = new int[k];
            selected = new int[k];
            for (int i = 0; i < k; i++) arr[i] = scan.nextInt();

            dfs(0, 0);
        }
    }

    private static void dfs(int start, int dept) {
        if (dept == 6) {
            print();
        } else {
            for (int i = start; i < k; i++) {
                selected[i] = 1;
                dfs(i + 1, dept + 1);
                selected[i] = 0;
            }
        }

    }

    private static void print() {
        for (int i = 0; i < k; i++) {
            if (selected[i] == 1)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
