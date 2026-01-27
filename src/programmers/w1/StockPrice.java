package programmers.w1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice stockPrice = new StockPrice();
        int[] result = stockPrice.solution(prices);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] > prices[i]) {
                int[] element = stack.pop();
                answer[element[1]] = i - element[1];
            }

            stack.push(new int[] {prices[i], i});
        }

        while (!stack.isEmpty()) {
            int[] element = stack.pop();
            answer[element[1]] = prices.length -1 - element[1];
        }

        return answer;
    }
}
