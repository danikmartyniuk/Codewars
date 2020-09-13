package hackerrank.statistics;

import java.util.ArrayList;

public class BasicProbability {
    public static void main(String[] args) {
        System.out.println(findProbability(9));
    }

    private static double findProbability (int sum) {
        ArrayList<StringBuilder> opt = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j <= sum) {
                    StringBuilder p = new StringBuilder();
                    p.append(i).append("+").append(j);
                    opt.add(p);
                }
            }
        }
        return opt.size() / 36.0;
    }
}
