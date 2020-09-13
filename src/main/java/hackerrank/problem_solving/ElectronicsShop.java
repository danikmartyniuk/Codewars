package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Collections;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyb = {40, 50, 60};
        int[] drives = {5, 8, 12};
        System.out.println(getMoneySpent(keyb, drives, 60));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                sums.add(keyboard + drive);
            }
        }
        sums.sort(Collections.reverseOrder());
        for (Integer sum : sums) {
            if (b >= sum) {
                return sum;
            }
        }
        return -1;
    }
}
