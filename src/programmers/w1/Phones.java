package programmers.w1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Phones {
    public static void main(String[] args) {
        String[] phoneBook = {"12","123","1235","567","88"};
        Phones phones = new Phones();
        System.out.println(phones.solution(phoneBook));
    }

    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String phone : phone_book) {
            set.add(phone);
        }

        for (int i = 0; i < phone_book.length; i++) {
            int length = phone_book[i].length();
            for (int j = length - 1; j >= 0 ; j--) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
