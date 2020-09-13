package hackerrank.statistics;

public class StandardDeviation {
    public static void main(String[] args) {
        System.out.println(findSD(new int[]{10, 40, 30, 50, 20}));
    }

    private static double findSD (int[] arr) {
        double mean = findMean(arr);
        double variance = 0.0;
        for (int value : arr) {
            variance += Math.pow(value - mean, 2.0) / arr.length;
        }
        return Math.round(Math.sqrt(variance) * 10.0) / 10.0;
    }

    static double findMean (int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }
}
