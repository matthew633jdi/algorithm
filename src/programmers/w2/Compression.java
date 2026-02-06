package programmers.w2;

import java.util.*;

public class Compression {

    public static void main(String[] args) {
        String msg = "KAKAO";
        Compression compression = new Compression();
        int[] result = compression.solution(msg);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)('A' + i)), i + 1);
        }

        int count = 27;
        int s = 0;

        while (s < msg.length()) {
            int e = s + 1;
            String prev = "";

            while (e <= msg.length()) {
                String current = msg.substring(s, e);
                if (!map.containsKey(current)) {
                    map.put(current, count++);
                    break;
                }

                prev = current;
                e++;
            }

            list.add(map.get(prev));
            s += prev.length();
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}