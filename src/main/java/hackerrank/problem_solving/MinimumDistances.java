package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumDistances {
    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
        System.out.println(minimumDistances(new int[]{3, 2, 1, 2, 3}));
    }

    static int minimumDistances(int[] arr) {
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> distances = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    indexes.add(j);
                }
            }
            if (indexes.size() > 1) {
                distances.add(indexes.get(1) - indexes.get(0));
            }
            indexes.clear();
        }

        int[] lengths = new int[distances.size()];
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = distances.get(i);
        }
        Arrays.sort(lengths);
        if (lengths.length > 0) {
            return lengths[0];
        } else {
            return -1;
        }

    }
}
