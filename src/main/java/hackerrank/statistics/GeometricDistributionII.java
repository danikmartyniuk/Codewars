package hackerrank.statistics;

public class GeometricDistributionII {
    public static void main(String[] args) {
        final double p = 1.0 / 3.0;
        double result = 0;
        for (int n = 1; n <= 5; n++) {
            result += findGeomDistr(n, p) * 1000.0 / 1000.0;
        }
        System.out.println(Math.round(result * 1000.0) / 1000.0);
    }

    private static double findGeomDistr (int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }

}
