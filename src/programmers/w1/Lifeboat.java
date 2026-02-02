package programmers.w1;

import java.util.Arrays;

public class Lifeboat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        Lifeboat lifeboat = new Lifeboat();
        System.out.println(lifeboat.solution(people, limit));

    }

    public int solution(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        Arrays.sort(people);
        int count = 0;
        while (l < r) {
            if (people[l] + people[r] <= limit) {
                count++;
                l++;
            }
            r--;
        }

//        return people.length / 2 == count ? count : count + (people.length - count * 2);
        return people.length - count;
    }

    public int solution1(int[] people, int limit) {
        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;
        int boats = 0;

        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }

            r--;
            boats++;
        }

        return boats;
    }
}
