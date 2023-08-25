package boj.algo.sort;

import boj.FastReader;

import java.util.*;

public class B10825 {
    static int n;
    static Student[] students;
    public static void main(String[] args) {
        input();
        solve();
    }

    private static void solve() {
        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i]= new Student(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
    }

    private static class Student implements Comparable<Student> {
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return this.getName();
        }

        @Override
        public int compareTo(Student o) {
            if (this.getKor() != o.getKor()) return o.getKor() - this.getKor();
            if (this.getEng() != o.getEng()) return  this.getEng() - o.getEng();
            if (this.getMath() != o.getMath()) return o.getMath() - this.getMath();
            else return this.getName().compareTo(o.getName());
        }
    }
}
