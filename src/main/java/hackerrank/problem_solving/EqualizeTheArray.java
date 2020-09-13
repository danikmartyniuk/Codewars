package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualizeTheArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{1, 2, 3, 1, 2, 3, 3, 3, 4}));
        System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }

    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> countSameNumbers = new ArrayList<>();
        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                counter++;
            } else {
                countSameNumbers.add(counter);
                counter = 1;
            }
            if (i == arr.length - 1) {
                countSameNumbers.add(counter);
            }
        }
        int max = 0;
        int sum = 0;
        for (Integer countSameNumber : countSameNumbers) {
            sum += countSameNumber;
            if (countSameNumber > max) {
                max = countSameNumber;
            }
        }
        return sum - max;
    }
}
