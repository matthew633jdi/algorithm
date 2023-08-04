package boj.step.onedementionarr;

import java.util.HashSet;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = new int[42];
//        int count = 0;
//
//        for (int i = 0; i < 10; i++) {
//            int num = scanner.nextInt();
//
//            arr[num % 42]++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                count++;
//            }
//        }
//
//        System.out.println(count);

        // advanced

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(scanner.nextInt() % 42);
        }

        System.out.println(set.size());

    }
}
