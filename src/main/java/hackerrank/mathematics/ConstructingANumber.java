package hackerrank.mathematics;

public class ConstructingANumber {
    public static void main(String[] args) {
        System.out.println(canConstruct(new int[]{40, 50, 60}));
        System.out.println(canConstruct(new int[]{1, 4}));
    }

    static String canConstruct(int[] a) {
        StringBuilder s = new StringBuilder();
        for (int value : a) {
            s.append(value);
        }
        int sum = 0;
        for (int i = 0; i < s.toString().length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.toString().charAt(i)));
        }
        if (sum % 3 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
