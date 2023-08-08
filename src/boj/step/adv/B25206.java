package boj.step.adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double gt = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            String[] line = br.readLine().split(" ");
            if (!line[2].equals("P")) {
                gt += Double.parseDouble(line[1]);
                total += gradeToScore(line[1], line[2]);
            }
        }

        System.out.printf("%f" ,total / gt);
    }

    public static double gradeToScore(String grade, String score) {
        double value = Double.parseDouble(grade);
        double result = 0f;

        if (score.charAt(0) == 'A') {
            if (score.charAt(1) == '+') {
                result = value * 4.5f;
            } else {
                result = value * 4.0f;
            }
        } else if (score.charAt(0) == 'B') {
            if (score.charAt(1) == '+') {
                result = value * 3.5f;
            } else {
                result = value * 3.0f;
            }
        } else if (score.charAt(0) == 'C') {
            if (score.charAt(1) == '+') {
                result = value * 2.5f;
            } else {
                result = value * 2.0f;
            }
        } else if (score.charAt(0) == 'D') {
            if (score.charAt(1) == '+') {
                result = value * 1.5f;
            } else {
                result = value * 1.0f;
            }
        }

        return result;
    }
}
