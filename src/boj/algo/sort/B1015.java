package boj.algo.sort;

import boj.FastReader;

import java.util.Arrays;
import java.util.*;

public class B1015 {
    static int n;
    static int[] P;
    static Ele[] B;

    static StringBuilder sb = new StringBuilder();

    private static class Ele implements Comparable<Ele> {
        private int num, idx;

        @Override
        public int compareTo(Ele o) {
            return num - o.num;
        }
    }
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        Arrays.sort(B);
        for (int i = 0; i < n; i++) {
            P[B[i].idx] = i;
        }

        for (int i = 0; i < n; i++) {
            sb.append(P[i]).append(' ');
        }

        System.out.println(sb.toString());

    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        P = new int[n];
        B = new Ele[n];
        for (int i = 0; i < n; i++) {
            B[i] = new Ele();
            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }
}
