package hackerrank.statistics;

public class PoissonDistributionI {
    public static void main(String[] args) {
        System.out.println(poissonDistribution(2.5, 5));
    }

    private static double poissonDistribution (double l, int k) {
        return Math.round((Math.pow(l, k) * Math.pow(2.71828, -l)) / fact(k) * 1000.0) / 1000.0;
    }
    
    private static int fact (int k) {
        int f = 1;
        for (int i = 1; i <= k; i++) {
            f *= i;
        }
        return f;
    }

}
