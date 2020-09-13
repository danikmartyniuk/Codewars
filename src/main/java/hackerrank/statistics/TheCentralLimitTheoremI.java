package hackerrank.statistics;

public class TheCentralLimitTheoremI {
    public static void main(String[] args) {
        int mean = 205;
        int sd = 15;
        int n = 49;
        int maxW = 9800;

        double sampleMean = n * mean;
        double sampleSTD = Math.sqrt(n) * sd;
        System.out.println(Math.round(cdf(maxW, sampleSTD, sampleMean) * 10000.0) / 10000.0);
    }

    private static double cdf (double x, double sd, double mean) {
        return 0.5 * (1 + erf(parameterZ(sd, mean, x)));
    }

    private static double parameterZ (double sd, double mean, double x) {
        return (x - mean) / (sd * Math.sqrt(2));
    }

    private static double erf (double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                t * ( 1.00002368 +
                        t * ( 0.37409196 +
                                t * ( 0.09678418 +
                                        t * (-0.18628806 +
                                                t * ( 0.27886807 +
                                                        t * (-1.13520398 +
                                                                t * ( 1.48851587 +
                                                                        t * (-0.82215223 +
                                                                                t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }
}
