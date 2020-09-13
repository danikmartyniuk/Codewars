package hackerrank.statistics;

import java.util.Arrays;

public class Quartile {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findQuartiles(new int[]{6, 7, 15, 36, 39, 40, 41, 42, 43, 47, 49})));
        System.out.println(Arrays.toString(findQuartiles(new int[]{3, 7, 8, 5, 12, 14, 21, 13, 18})));
        System.out.println(Arrays.toString(findQuartiles(new int[]{3, 7, 8, 5, 12, 14, 21, 15, 18, 14})));
    }

    private static int[] findQuartiles (int[] arr) {
        Arrays.sort(arr);
        int[] quartiles = new int[3];
        quartiles[0] = findMedian(arr, 0, arr.length / 2);
        quartiles[1] = findMedian(arr, 0, arr.length);
        if (arr.length % 2 == 0) {
            quartiles[2] = findMedian(arr, arr.length / 2, arr.length);
        } else {
            quartiles[2] = findMedian(arr, arr.length / 2 + 1, arr.length);
        }
        return quartiles;
    }

    private static int findMedian (int[] arr, int startIndex, int endIndex) {
        int[] subArray = Arrays.copyOfRange(arr, startIndex, endIndex);
        if (subArray.length % 2 != 0) {
            return subArray[subArray.length / 2];
        } else {
            return (int) ((subArray[subArray.length / 2] + subArray[subArray.length / 2 - 1]) / 2.0);
        }
    }

}
