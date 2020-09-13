package hackerrank.problem_solving;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(24);
    }

    static void extraLongFactorials(int n) {
        BigInteger one = new BigInteger("1");
        BigInteger factorial = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(n); i.compareTo(one) > 0; i = i.subtract(one)) {
            factorial = factorial.multiply(i);
        }
        System.out.println(factorial);
    }
}
