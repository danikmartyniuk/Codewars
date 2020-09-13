package hackerrank.statistics;

import java.util.ArrayList;
import java.util.Arrays;

public class MeanMedianMode {
    public static void main(int n, int[] arr) {
        System.out.println(findMean(arr));
        System.out.println(findMedian(arr));
        System.out.println(findMode(arr));
    }

    static double findMean (int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }

    static double findMedian (int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
    }

    static int findMode (int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> counters = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int occ = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (arr[i] == arr[j]) {
                        occ++;
                    }
                }
            }
            counters.add(occ);
        }
        int mostOften = 0;
        for (int i = 1; i < counters.size(); i++) {
            if (counters.get(i) > counters.get(mostOften)) {
                mostOften = i;
            }
        }
        if (mostOften != 1) {
            return arr[mostOften];
        } else {
            return arr[0];
        }
    }
}
