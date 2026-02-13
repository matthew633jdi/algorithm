package programmers.w3;

import java.util.HashSet;
import java.util.Set;

public class RepresentingN {
    public static void main(String[] args) {
        int n = 5;
        int number = 12;
        RepresentingN representingN = new RepresentingN();
        System.out.println(representingN.solution(n, number));
    }

    public int solution(int N, int number) {
        Set<Integer>[] dp = new HashSet[9];
        for(int i=1; i<9; i++) dp[i] = new HashSet<>();

        for(int k=1; k<=8; k++) {
            dp[k].add(Integer.parseInt(String.valueOf(N).repeat(k)));

            for(int i=1; i<k; i++) {
                int j = k - i;
                for (int op1: dp[i]) {
                    for (int op2: dp[j]) {
                        dp[k].add(op1 + op2);
                        dp[k].add(op1 - op2);
                        dp[k].add(op1 * op2);
                        if (op2 != 0) dp[k].add(op1 / op2);
                    }
                }
            }

            if(dp[k].contains(number)) return k;
        }

        return -1;
    }
}
