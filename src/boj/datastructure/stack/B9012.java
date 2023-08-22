package boj.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            boolean isPair = true;

            Stack<Character> stack = new Stack<>();
            for (char ch : word.toCharArray()) {
                if (ch == '(') stack.push(ch);
                else {
                    if (stack.isEmpty()) {
                        isPair = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty() && isPair) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
