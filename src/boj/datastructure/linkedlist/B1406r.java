package boj.datastructure.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * The type B 1406.
 * input : word (word.len <= 100,000)
 * operation.len M ( 1 <= M <= 500,000)
 * M
 *
 * output : result word
 */
public class B1406r {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        int t = Integer.parseInt(reader.readLine());

        LinkedList<Character> list = new LinkedList<>();

        for (char c : word.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> cursor = list.listIterator();

        while (cursor.hasNext()) cursor.next();


        for (int i = 0; i < t; i++) {
            String op = reader.readLine();

            switch (op) {
                case "L":
                    if (cursor.hasPrevious()) cursor.previous();
                    break;
                case "D":
                    if (cursor.hasNext()) cursor.next();
                    break;
                case "B":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                default:
                    cursor.add(op.charAt(2));
                    break;
            }
        }

        System.out.println(list.toString().replaceAll(", ", "").replace("[", "").replace("]", ""));
    }
}
