package hackerrank.statistics;

import java.util.ArrayList;

public class MoreDice {
    public static void main(String[] args) {
        System.out.println(findProbability(6));
    }

    private static double findProbability (int neededSum) {
        ArrayList<StringBuilder> opt = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j != i & j + i == neededSum) {
                    opt.add(new StringBuilder().append(i).append("+").append(j));
                }
            }
        }
        return opt.size() / 36.0;
    }
}
