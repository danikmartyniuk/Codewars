package hackerrank.problem_solving;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println(String.format("%s\n%s\n%s", addZeros(pos/arr.length), addZeros(neg/arr.length), addZeros(zero/arr.length)));
    }

    static String addZeros (double num) {
        String number = Double.toString(num);
        if (number.length() > 7) {
            number = number.substring(0, 8);
        } else {
            number += IntStream.range(0, 8 - number.length()).mapToObj(j -> "0").collect(Collectors.joining(""));
        }
        return number;
    }
}
