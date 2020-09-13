package hackerrank.problem_solving;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10, 22}, 50));
    }

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int numberOfToys = 0;
        int money = 0;
        for (int i = 0; i < prices.length; i++) {
            if (money <= k) {
                money += prices[i];
                numberOfToys++;
                if (money > k) {
                    return numberOfToys - 1;
                }
            }
        }
        return numberOfToys;
    }
}
