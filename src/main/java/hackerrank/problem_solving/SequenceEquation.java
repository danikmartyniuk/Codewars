package hackerrank.problem_solving;

import java.util.Arrays;

public class SequenceEquation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }

    static int[] permutationEquation(int[] p) {
        int[] yValues = new int[p.length];

        for (int i = 1; i <= p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i == p[j]) {
                    for (int f = 0; f < p.length; f++) {
                        if (j + 1 == p[f]) {
                            yValues[i - 1] = f + 1;
                        }
                    }
                }
            }
        }

        return yValues;
    }
}
