package boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The type B 2798.
 * 각 카드에는 양의 정수가 쓰여있음.
 * (딜러)딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓음
 * 그런 후 딜러는 숫자 M을 크게 외침
 * (플레이어) 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 함
 * 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 함
 *
 * => N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 최대한 M에 가까운 카드 3장의 합을 구하라.
 * input : N (3 <= N <= 100) M ( 10 <= M <= 3 * 10^5) \n 카드 수
 * output : 합
 */
public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

    }
}