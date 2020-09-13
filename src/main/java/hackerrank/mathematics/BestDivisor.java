package hackerrank.mathematics;

import java.util.ArrayList;

public class BestDivisor {
    public static void main(String[] args) {
        System.out.println(getLargestDivisor(12));
    }

    private static int getLargestDivisor (int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        ArrayList<Integer> sumOfDigits = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                sumOfDigits.add(getSumOfDigits(i));
            }
        }

        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < sumOfDigits.size(); i++) {
            if (maxSum <= sumOfDigits.get(i)) {
                maxSum = sumOfDigits.get(i);
                index = i;
            }
        }
        return divisors.get(index);
    }

    private static int getSumOfDigits (int divisor) {
        String[] digits = Integer.toString(divisor).split("");
        int sumOfDigits = 0;
        for (String digit : digits) {
            sumOfDigits += Integer.parseInt(digit);
        }
        return sumOfDigits;
    }
}
