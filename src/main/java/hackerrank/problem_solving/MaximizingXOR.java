package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximizingXOR {
    public static void main(String[] args) {
        System.out.println(maximizingXor(10, 15));
        System.out.println(maximizingXor(5, 6));
    }

    static int maximizingXor(int l, int r) {
        if (r - l == 1) {
            return r^l;
        }
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            for (int j = i; j < r; j++) {
                results.add(i^j);
            }
        }

        int[] xorRes = new int[results.size()];
        for (int i = 0; i < xorRes.length; i++) {
            xorRes[i] = results.get(i);
        }
        Arrays.sort(xorRes);
        return xorRes[xorRes.length - 1];
    }

}
