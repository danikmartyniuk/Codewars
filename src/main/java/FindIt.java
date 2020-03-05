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
        String equation = "99X=1(mod 8)";
        System.out.println(new FindIt().findIt(equation));
    }

    public int findIt(String s) {
        int multiplier = Integer.parseInt(s.substring(0, s.indexOf("X")));
        int result = Integer.parseInt(s.substring(s.indexOf("=") + 1, s.indexOf("(")));
        int mod = Integer.parseInt(s.substring(s.indexOf(" ") + 1, s.indexOf(")")));
        int X = (result - (mod * (result/mod)))/multiplier;
        if (multiplier % 2 == 0) {
            do {
                multiplier /= 2;
            } while (String.valueOf(multiplier).length() == 1);
        } else if (multiplier % 3 == 0) {
            do {
                multiplier /= 3;
            } while (String.valueOf(multiplier).length() == 1);
        } else if (multiplier % 5 == 0) {
            do {
                multiplier /= 5;
            } while (String.valueOf(multiplier).length() == 1);
        } else if (multiplier % 7 == 0) {
            do {
                multiplier /= 7;
            } while (String.valueOf(multiplier).length() == 1);
        }
        return Math.abs(multiplier - mod);
    }
}
