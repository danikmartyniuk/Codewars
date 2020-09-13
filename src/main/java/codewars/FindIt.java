package codewars;

/**
 * Given String s in the form of equation.
 * Your task is to parse the s string and find the "X" value from string.
 *
 * Example:
 * For s = "99X=1(mod 8)", the output should be
 * findIt(s) = 3.
 *
 * s = "99X=1(mod 8)".
 * To solve this equation, first you must reduce the left side.
 * Make it as small as possible without being negative by decreasing it by mod.
 * So,for example 99X would reduce to 3x.
 *
 * Now your expression should look like this:
 * 3X=1(mod 8).
 * Now that the left side is done, we switch focus to the right side.
 * If we mod by 8, we can safely add or subtract 8 to get the same answer, so we add 8 to the number on the right until we get a number evenly divisible by the left number.
 * So 3X=1(mod 8), goes to 3x=9(mod 8).
 *
 * 9 is evenly divided by 3, so we stop there. Our final step is to isolate X, so we divide 9 by 3 leaving us with X=3.
 *
 * If there no result, return -1 instead.
 */

public class FindIt {
    public static void main(String[] args) {
        String equation = "145X=1(mod 10)";
        System.out.println(new FindIt().findIt(equation));
    }

    public int findIt(String s) {
        for (int i = 1; i <= 10; i++) {
            int mod = Integer.parseInt(s.substring(s.indexOf(" ") + 1, s.indexOf(")")));
            if ((Integer.parseInt(s.substring(0, s.indexOf("X"))) * i) % mod
                    == Integer.parseInt(s.substring(s.indexOf("=") + 1, s.indexOf("("))) % mod) {
                return i;
            }
        }
        return -1;
    }
}
