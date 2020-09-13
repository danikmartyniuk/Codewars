package hackerrank.problem_solving;

import java.util.Arrays;

public class CircularArrayRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2})));
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i + k < a.length) {
                newArray[i + k] = a[i];
            } else {
                newArray[i + k - a.length] = a[i];
            }
        }
        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answers[i] = newArray[queries[i]];
        }
        return answers;
    }
}
