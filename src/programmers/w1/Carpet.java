package programmers.w1;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        Carpet carpet = new Carpet();
        int[] result = carpet.solution1(brown, yellow);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int width = yellow; width > 0; width--) {
            if (yellow % width != 0) continue;
            int height = yellow / width;
            if (height * 2 + width * 2 + 4 == brown) {
                answer[0] = width + 2;
                answer[1] = height + 2;
                return answer;
            }
        }

        return answer;
    }

    public int[] solution1(int brown, int yellow) {
        for (int h = 1; h * h <= yellow; h++) {
            if (yellow % h != 0) continue;

            int w = yellow / h;
            if (w * 2 + h * 2 + 4 == brown) {
                return new int[] {w + 2, h + 2};
            }
        }

        return new int[]{0, 0};
    }
}
