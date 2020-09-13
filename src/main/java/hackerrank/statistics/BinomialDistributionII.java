package hackerrank.statistics;

public class BinomialDistributionII {
    public static void main(String[] args) {
        final double p = 0.12;
        final int n = 10;
        double resultOne = 0;
        for (int x = 0; x <= 2; x++) {
            resultOne += Math.round(findBinomial(n, x, p) * 1000.0) / 1000.0;
        }
        System.out.println(resultOne);
        double resultTwo = 0;
        for (int x = 2; x <= n; x++) {
            resultTwo += Math.round(findBinomial(n, x, p) * 1000.0) / 1000.0;
        }
        System.out.println(resultTwo);
    }

    private static double findBinomial (int n, int x, double p) {
        return combXinN(n, x) * pPoweredX(x, p) * qPoweredNminusX(1 - p, n, x);
    }

    private static double combXinN (int n, int x) {
        return fact(n) / (fact(n - x) * fact(x));
    }

    private static double fact (int number) {
        int f = 1;
        for (int i = 1; i <= number; i++ ) {
            f *= i;
        }
        return f;
    }

    private static double pPoweredX (int x, double p) {
        return Math.pow(p, x);
    }

    private static double qPoweredNminusX (double q, int n, int x) {
        return Math.pow(q, n - x);
    }

}
