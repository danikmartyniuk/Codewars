package hackerrank.statistics;

import java.util.ArrayList;
import java.util.Arrays;

public class InterquartileRange {
    public static void main(String[] args) {
        System.out.println(interQuartile(new int[]{6, 12, 8, 10, 20, 16}));
    }

    private static int[] addElementsToArray (int[] arr, int[] frequency) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                a.add(arr[i]);
            }
        }
        int[] newArr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            newArr[i] = a.get(i);
        }
        return newArr;
    }

    private static double interQuartile (int[] arr) {
        double[] quartiles = findQuartiles(arr);
        return quartiles[2] - quartiles[0];
    }

    private static double[] findQuartiles (int[] arr) {
        Arrays.sort(arr);
        double[] quartiles = new double[3];
        quartiles[0] = findMedian(arr, 0, arr.length / 2);
        quartiles[1] = findMedian(arr, 0, arr.length);
        if (arr.length % 2 == 0) {
            quartiles[2] = findMedian(arr, arr.length / 2, arr.length);
        } else {
            quartiles[2] = findMedian(arr, arr.length / 2 + 1, arr.length);
        }
        return quartiles;
    }

    private static double findMedian (int[] arr, int startIndex, int endIndex) {
        int[] subArray = Arrays.copyOfRange(arr, startIndex, endIndex);
        if (subArray.length % 2 != 0) {
            return subArray[subArray.length / 2];
        } else {
            return ((subArray[subArray.length / 2] + subArray[subArray.length / 2 - 1]) / 2.0);
        }
    }
}
