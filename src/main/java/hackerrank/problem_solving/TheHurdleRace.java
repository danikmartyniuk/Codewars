package hackerrank.problem_solving;

import java.util.Arrays;

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }

    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        if (height[height.length - 1] <= k) {
            return height[height.length - 1] - k;
        } else {
            return 0;
        }
    }
}
