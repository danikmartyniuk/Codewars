package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class ManasaAndStones {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stones(3, 1, 2)));
        System.out.println(Arrays.toString(stones(4, 10, 100)));
    }

    static int[] stones(int n, int a, int b) {
        ArrayList<Integer> sums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = a * (n - i - 1) + b * i;
            if (!sums.contains(s)) {
                sums.add(s);
            }
        }

        int[] arrayOfSums = new int[sums.size()];
        for (int i = 0; i < arrayOfSums.length; i++) {
            arrayOfSums[i] = sums.get(i);
        }

        return arrayOfSums;
    }
}
