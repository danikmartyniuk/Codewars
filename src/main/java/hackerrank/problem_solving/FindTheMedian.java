package hackerrank.problem_solving;

import java.util.Arrays;

public class FindTheMedian {
    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{0, 1, 2, 4, 6, 5, 3}));
    }

    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
