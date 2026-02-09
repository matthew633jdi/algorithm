package programmers.w3;

import java.util.ArrayDeque;
import java.util.Deque;

public class BiggestNumber {
    public static void main(String[] args) {
        String number = "10";
        int k = 1;
        BiggestNumber biggestNumber = new BiggestNumber();
        System.out.println(biggestNumber.solution(number, k));
    }

    public String solution(String number, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(number.charAt(0));

        for (int i = 1; i < number.length(); i++) {
            char c = number.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peek() < c) {
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder builder = new StringBuilder();

        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.reverse().toString();
    }
}
