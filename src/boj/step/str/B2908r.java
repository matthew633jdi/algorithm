package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2908r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

//        String answer = null;
//        for (int i = 2; i >= 0; i--) {
//            if (nums[0].charAt(i) == nums[1].charAt(i)) {
//                continue;
//            } else if (nums[0].charAt(i) > nums[1].charAt(i)) {
//                answer = nums[0];
//                break;
//            } else {
//                answer = nums[1];
//                break;
//            }
//        }
//
//        for (int i = 2; i >= 0 ; i--) {
//            System.out.print(answer.charAt(i));
//        }

        int a = Integer.parseInt(new StringBuilder().append(nums[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(nums[1]).reverse().toString());

        System.out.println(a > b ? a : b);
    }
}
