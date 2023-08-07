package boj.step.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622r {
    public static void main(String[] args) throws IOException {
        // 해당 알파벳이 숫자 몇을 의미하는지 파악
        // 숫자에 + 1
        // 총합 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
//        String[] dial = {"ABC","DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
//        int total = 0;
//        for (int i = 0; i < word.length(); i++) {
//            String c = String.valueOf(word.charAt(i));
//
//            for (int j = 0; j < dial.length; j++) {
//                if (dial[j].contains(c)) {
//                    total += j + 3;
//                }
//            }
//        }
//
//        System.out.println(total);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }

        System.out.println(count);
    }
}
