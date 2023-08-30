package boj.algo;

import boj.FastReader;

import java.util.TreeSet;

public class B1181 {
    static int n;
    static TreeSet<String> set;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        input();
        pro();
    }

    private static void pro() {
        set.forEach(System.out::println);
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();

        set = new TreeSet<>((o1, o2) -> {
            if (o1.length() != o2.length()) return o1.length() - o2.length();
            else return o1.compareTo(o2);
        });
        for (int i = 0; i < n; i++) set.add(scan.next());
    }
}
