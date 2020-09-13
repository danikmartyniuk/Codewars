package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamParlor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8})));
        System.out.println(Arrays.toString(icecreamParlor(9, new int[]{1, 3, 4, 6, 7, 9})));
    }

    static int[] icecreamParlor(int m, int[] arr) {
        int[] indexes = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j & arr[i] + arr[j] == m) {
                    indexes[0] = i + 1;
                    indexes[1] = j + 1;
                    break;
                }
            }
        }

        Arrays.sort(indexes);
        return indexes;
    }
}
