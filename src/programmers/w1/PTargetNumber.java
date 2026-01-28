package programmers.w1;

import java.util.HashMap;
import java.util.Map;

public class PTargetNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        PTargetNumber pTargetNumber = new PTargetNumber();
        System.out.println(pTargetNumber.solution(numbers, target));
    }

    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int sum, int idx) {
        if (idx == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        return dfs(numbers, target, sum + numbers[idx], idx + 1) + dfs(numbers, target, sum - numbers[idx], idx + 1);
    }

    public int solution2(int[] numbers, int target) {
        Map<Integer, Integer> dp = new HashMap<>();

        dp.put(0, 1);

        for (int num : numbers) {
            Map<Integer, Integer> nextDp = new HashMap<>();

            for (int sum : dp.keySet()) {
                int count = dp.get(sum);

                nextDp.put(sum + num, nextDp.getOrDefault(sum + num, 0) + count);
                nextDp.put(sum - num, nextDp.getOrDefault(sum - num, 0) + count);
            }

            dp = nextDp;
        }

        return dp.getOrDefault(target, 0);
    }
}
