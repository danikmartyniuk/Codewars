package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestNumbers(new int[]{5, 4, 3, 2})));
        System.out.println(Arrays.toString(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457,
                -6461594, 266854, -520, -470})));
    }

    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> numbers = new ArrayList<>();

        int[] differences = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            differences[i-1] = arr[i] - arr[i-1];
        }
        Arrays.sort(differences);
        int minDifference = differences[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == minDifference) {
                numbers.add(arr[i-1]);
                numbers.add(arr[i]);
            }
        }

        int[] finArray = new int[numbers.size()];
        for (int i = 0; i < finArray.length; i++) {
            finArray[i] = numbers.get(i);
        }
        return finArray;
    }

}
