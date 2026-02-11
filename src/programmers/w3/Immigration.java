package programmers.w3;

import java.util.Arrays;

public class Immigration {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        Immigration immigration = new Immigration();
        System.out.println(immigration.solution(n, times));
    }

    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        Arrays.sort(times);
        long right = (long) n * times[times.length - 1];

        while (left <= right) {
            long mid = (left + right) / 2;

            long passCount = 0;

            for (int i = 0; i < times.length; i++) {
                passCount += mid / times[i];
            }

            if (passCount >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return answer;
    }
}
