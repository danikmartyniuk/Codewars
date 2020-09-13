package hackerrank.problem_solving;

public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("bcxz"));
        System.out.println(funnyString("acxz"));
    }

    static String funnyString(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1)) !=
                    Math.abs((int) reversed.charAt(i) - (int) reversed.charAt(i+1))) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

}
