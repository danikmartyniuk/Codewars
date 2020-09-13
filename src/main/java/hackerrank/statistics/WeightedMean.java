package hackerrank.statistics;

public class WeightedMean {
    public static void main(String[] args) {
        System.out.println(findWeightedMean(new int[]{10, 40, 30, 50, 20, 10, 40, 30, 50, 20}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    static double findWeightedMean (int[] values, int[] weights) {
        double VxW = 0.0;
        double v = 0.0;
        for (int i = 0; i < values.length; i++) {
            VxW += values[i] * weights[i];
            v += weights[i];
        }
        return Math.round((VxW / v) * 10.0) / 10.0;
    }

}
