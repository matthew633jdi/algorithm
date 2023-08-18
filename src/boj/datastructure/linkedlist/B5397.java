package boj.datastructure.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> lStack = new Stack<>();
            Stack<Character> rStack = new Stack<>();

            StringBuilder sb = new StringBuilder();
            for (char ch : reader.readLine().toCharArray()) {

                if (ch == '<') {
                    if (!rStack.isEmpty()) {
                        lStack.push(rStack.pop());
                    }
                } else if (ch == '>') {
                    if (!lStack.isEmpty()) {
                        rStack.push(lStack.pop());
                    }
                } else if (ch == '-') {
                    if (!rStack.isEmpty()) {
                        rStack.pop();
                    }
                } else {
                    rStack.push(ch);
                }
            }

            while (!rStack.isEmpty())
                lStack.push(rStack.pop());

            while (!lStack.isEmpty())
                sb.append(lStack.pop());

            System.out.println(sb);
        }
    }
}
