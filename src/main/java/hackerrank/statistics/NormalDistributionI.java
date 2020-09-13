package hackerrank.statistics;

public class NormalDistributionI {
    public static void main(String[] args) {
        final int sd = 2;
        final int mean = 20;
        System.out.println(Math.round(cdf(19.5, sd, mean) * 1000.0) / 1000.0);
        System.out.println(Math.round((cdf(22, sd, mean) - cdf(20, sd, mean)) * 1000.0) / 1000.0);
    }

    private static double cdf (double x, int sd, int mean) {
        return 0.5 * (1 + erf(parameterZ(sd, mean, x)));
    }

    private static double parameterZ (int sd, int mean, double x) {
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

    private static double calcNormalDistribution (double x, int sd, int mean) {
        return (1 / (sd * Math.sqrt(2 * Math.PI))) * Math.pow(2.71828, -((Math.pow(x - mean, 2)) / (2 * sd * sd)));
    }
}
