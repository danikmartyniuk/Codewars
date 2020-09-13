package hackerrank.statistics;

public class BinomialDistributionI {
    public static void main(String[] args) {
        double boysRatio = 1.09;
        double p = Math.round((boysRatio / (boysRatio + 1)) * 1000.0) / 1000.0;
        double result = 0;
        int n = 6;
        for (int x = 3; x <= n; x++) {
            result += Math.round(findBinomial(n, x, p) * 1000.0) / 1000.0;
        }
        System.out.println(result);
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
