package codewars;

import java.math.BigInteger;

/**
 * Given two numbers: 'left' and 'right' (1 <= 'left' <= 'right' <= 200000000000000) return sum of all '1' occurencies
 * in binary representations of numbers between 'left' and 'right' (including both)
 * Example:
 * countOnes 4 7 should return 8, because:
 * 4(dec) = 100(bin), which adds 1 to the result.
 * 5(dec) = 101(bin), which adds 2 to the result.
 * 6(dec) = 110(bin), which adds 2 to the result.
 * 7(dec) = 111(bin), which adds 3 to the result.
 * So finally result equals 8.
 * WARNING: Segment may contain billion elements, to pass this kata, your solution cannot iterate through all numbers in the segment!
 */

public class BitCount {

    public static void main(String[] args) {
        System.out.println(countOnes(12, 29));
    }

    public static BigInteger countOnes (long left, long right) {
        int sum = 0;
        for (long i = left; i <= right; i++) {
            //get string of binary
            //parse it to the int array
            //if arr[j] == 1 --> sum++
        }
        return BigInteger.ONE;
    }
}