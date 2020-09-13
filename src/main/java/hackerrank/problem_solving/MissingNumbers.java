package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingNumbers(new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
                                                          new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204})));
    }

    static int[] missingNumbers(int[] arr, int[] brr) {
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < brr.length; i++) {
            if (countDuplicates(brr[i], brr) != countDuplicates(brr[i], arr) & !missingNumbers.contains(brr[i])) {
                    missingNumbers.add(brr[i]);
            }
        }

        int[] lostNumbers = new int[missingNumbers.size()];
        for (int i = 0; i < lostNumbers.length; i++) {
            lostNumbers[i] = missingNumbers.get(i);
        }
        Arrays.sort(lostNumbers);
        return lostNumbers;
    }

    static int countDuplicates (int n, int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                counter++;
            }
        }
        return counter;
    }
}
