package programmers.w1;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Hindex hindex = new Hindex();
        System.out.println(hindex.solution(citations));
    }

    public int solution(int[] citations) {
        int answer = 0;
        int l = 0, r = citations.length - 1;
        Arrays.sort(citations);

        while (l <= r) {
            int mid = (l + r) / 2;
            int value = citations[mid];
            int count = citations.length - mid;

            if (value >= count) {
                answer = count;
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return answer;
    }

    public int solution1(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int count = citations.length -i;
            if (citations[i] >= count) {
                return count;
            }
        }

        return 0;
    }
}
