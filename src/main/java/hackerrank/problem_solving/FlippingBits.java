package hackerrank.problem_solving;

import java.math.BigInteger;

public class FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
        System.out.println(flippingBits(0));
    }

    static long flippingBits(long n) {
        return parseLong(addZerosAndConvertToLong(Long.toBinaryString(n)));
    }

    static String addZerosAndConvertToLong (String bits) {
        return "0".repeat(32 - bits.length()) + bits;
    }

    private static long parseLong(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return new BigInteger(sb.toString(), 2).longValue();
    }

}
