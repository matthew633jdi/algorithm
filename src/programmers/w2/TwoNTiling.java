package programmers.w2;

public class TwoNTiling {
    private static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        int n = 60000;
        TwoNTiling twoNTiling = new TwoNTiling();
        System.out.println(twoNTiling.solution(n));
    }

    public int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[n];
    }


    public int solution1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev2 = 1;
        int prev1 = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = (prev1 + prev2) % MOD;

            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}
