package boj.step.primary;

public class Tc02 {
    public static void main(String[] args) {
        System.out.println(func2(new int[]{1, 52, 48}, 3));
        System.out.println(func2(new int[]{50,42}, 2));
        System.out.println(func2(new int[]{4, 13, 63, 87}, 4));
    }

    /**
     * Func 2 int.
     * (n-1) + (n-2) + ... + 1 = n * (n -1) / 2
     * @param arr the arr
     * @param n   the n
     * @return the int
     */
    static int func2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 100) {
                    return 1;
                }
            }
        }

        return 0;
    }
}
