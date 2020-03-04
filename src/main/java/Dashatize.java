/**
 * Given a number, return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.
 */

public class Dashatize {
    public static void main(String[] args) {
        System.out.println(dashatize(-1));
    }

    public static String dashatize(int num) {
        StringBuilder str = new StringBuilder();
        String s = Integer.toString(num);
        if (num < 0) {
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            int checkingNum = Integer.parseInt(String.valueOf(s.charAt(i))) % 2;
            if (i == s.length() - 1 & checkingNum != 0) {
                str.append("-").append(s.charAt(i));
            } else if (i == 0 & checkingNum != 0) {
                str.append(s.charAt(i)).append("-");
            } else if (checkingNum == 0) {
                str.append(s.charAt(i));
            } else {
                str.append("-").append(s.charAt(i)).append("-");
            }
        }
        if (str.toString().length() <= 2) {
            return str.toString().replaceAll("-", "");
        } else {
            return str.toString().replaceAll("--", "-");
        }
    }
}
