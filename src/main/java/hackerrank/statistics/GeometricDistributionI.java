package hackerrank.statistics;

public class GeometricDistributionI {
    public static void main(String[] args) {
        final int n = 5;
        final double p = 1.0 / 3.0;
        System.out.println(Math.round(findGeomDistr(n, p) * 1000.0) / 1000.0);
    }

    private static double findGeomDistr (int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
}
