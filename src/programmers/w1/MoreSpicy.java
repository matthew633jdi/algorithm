package programmers.w1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        MoreSpicy moreSpicy = new MoreSpicy();
        System.out.println(moreSpicy.solution(scoville, k));
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : scoville) {
            pq.offer((long) num);
        }

        int count = 0;
        while (!pq.isEmpty()) {
            if (pq.peek() >= K) return count;
            if (pq.size() < 2) break;

            Long smallest = pq.poll();
            Long secondSmallest = pq.poll();

            Long result = smallest + (secondSmallest * 2);
            pq.offer(result);
            count++;
        }

        return -1;
    }

    public int solution2(int[] scoville, int K) {
        List<Long> list = new ArrayList<>();
        for (int num : scoville) {
            list.add((long) num);
        }

        PriorityQueue<Long> pq = new PriorityQueue<>(list);

        int count = 0;
        while (pq.size() >= 2 && pq.peek() < K) {
            long first = pq.poll();
            long second = pq.poll();
            pq.offer(first + second * 2);
            count++;
        }

        return pq.peek() >= K ? count : -1;
    }
}
