package hackerrank.problem_solving;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

    static int findDigits(int n) {
        String[] digits = Integer.toString(n).replace("-", "").replace("0", "").split("");
        int counter = 0;
        for (int i = 0; i < digits.length; i++) {
            if (n % Integer.parseInt(digits[i]) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
