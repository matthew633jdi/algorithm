package boj.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while (!((line = br.readLine()).equals("."))) {
            Stack<Character> stack = new Stack<>();
            boolean isPair = true;
            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') stack.push(ch);
                else if (ch == ')'){
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isPair = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isPair = false;
                        break;
                    }
                    stack.pop();
                }
            }
            System.out.println(isPair ? "yes" : "no");
        }
    }
}
