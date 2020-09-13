package hackerrank.statistics;

public class PoissonDistributionII {
    public static void main(String[] args) {
        System.out.println(findCostA(0.88) + "\n" + findCostB(1.55));
    }

    private static double findX (double l) {
        return l + Math.pow(l, 2);
    }

    private static double findCostA (double l) {
        return 160 + 40 * findX(l);
    }

    private static double findCostB (double l) {
        return 128 + 40 * findX(l);
    }
}