package hackerrank.statistics;

import java.util.Arrays;

public class LeastSquareRegressionLine {
    public static void main(String[] args) {
        System.out.println(getStatisticsGrade(findEquation(new int[]{95, 85, 80, 70, 60}, new int[]{85, 95, 70, 65, 70}), 80));
        System.out.println(Arrays.toString(findEquation(new int[]{95, 85, 80, 70, 60}, new int[]{85, 95, 70, 65, 70})));
    }

    private static double[] findEquation (int[] math, int[] stats) {
        double sumOfMath = 0;
        double sumOfStats = 0;
        int Xsquared = 0;
        int xy = 0;
        for (int i = 0; i < math.length; i++) {
            sumOfMath += math[i];
            sumOfStats += stats[i];
            Xsquared += Math.pow(math[i], 2);
            xy += math[i] * stats[i];
        }
        double[] equation = new double[2];
        double b = (math.length * xy - sumOfMath * sumOfStats) / (math.length * Xsquared - Math.pow(sumOfMath, 2));
        double a = sumOfStats / stats.length - b * (sumOfMath / math.length);
        equation[0] = Math.round((a) * 1000.0) / 1000.0;
        equation[1] = Math.round((b) * 1000.0) / 1000.0;
        return equation;
    }

    private static double getStatisticsGrade (double[] xAndY, int specificValue) {
        return xAndY[0] + xAndY[1] * specificValue;
    }
}
