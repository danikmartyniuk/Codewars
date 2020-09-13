package hackerrank.problem_solving;

import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {254961783, 604179258, 462517083, 967304281, 860273491};
        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                minSum += arr[i];
            } else if (i == arr.length - 1) {
                maxSum += arr[i];
            } else {
                minSum += arr[i];
                maxSum += arr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }
}
