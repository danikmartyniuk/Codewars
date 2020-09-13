package hackerrank.statistics;

public class PearsonCorrelationCoefficientI {
    public static void main(String[] args) {
        System.out.println(Math.round(pcc(new double[]{10, 9.8, 8, 7.8, 7.7, 7, 6, 5, 4, 2}, new double[]{200, 44, 32, 24, 22, 17, 15, 12, 8, 4}) * 1000.0) / 1000.0);
    }

    private static double cov (double[] arr1, double[] arr2) {
        double mean1 = findMean(arr1);
        double mean2 = findMean(arr2);
        double product = 0;
        for (int i = 0; i < arr1.length; i++) {
            product += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        return product / arr1.length;
    }

    private static double pcc (double[] arr1, double[] arr2) {
        double sd1 = findSD(arr1);
        double sd2 = findSD(arr2);
        return cov(arr1, arr2) / (sd1 * sd2);
    }

    private static double findMean (double[] arr) {
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }

    private static double findSD (double[] arr) {
        double mean = findMean(arr);
        double variance = 0.0;
        for (double value : arr) {
            variance += Math.pow(value - mean, 2.0) / arr.length;
        }
        return Math.sqrt(variance);
    }

}
