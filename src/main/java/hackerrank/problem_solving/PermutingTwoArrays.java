package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Collections;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        System.out.println(twoArrays(10, new int[]{2, 1, 3}, new int[]{7, 8, 9}));
        System.out.println(twoArrays(5, new int[]{1, 2, 2, 1}, new int[]{3, 3, 3, 4}));
    }

    static String twoArrays(int k, int[] A, int[] B) {
        Integer[] arrA = Arrays.stream(A)
                .boxed()
                .toArray(Integer[]::new);
        Integer[] arrB = Arrays.stream(B)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(arrA, Collections.reverseOrder());
        Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
            if (!(arrA[i] + arrB[i] >= k)) {
                return "NO";
            }
        }
        return "YES";
    }

}
