package hackerrank.statistics;

public class TheCentralLimitTheoremIII {
    public static void main(String[] args) {
        int n = 100;
        int mean = 500;
        int sd = 80;
        double z = 1.96;
        for (int i = 0; i < confidenceInterval(n, mean, sd, z).length; i++) {
            System.out.println(confidenceInterval(n, mean, sd, z)[i]);
        }
    }

    private static double[] confidenceInterval (int n, int mean, int sd, double z) {
        double[] boundaryValues = new double[2];
        double value = z * (sd / Math.sqrt(n));
        boundaryValues[0] = mean - value;
        boundaryValues[1] = mean + value;
        return boundaryValues;
    }
}
