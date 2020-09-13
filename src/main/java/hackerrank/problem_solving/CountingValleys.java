package hackerrank.problem_solving;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    static int countingValleys(int n, String s) {
        int valleys = 0;
        int level = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else {
                level--;
            }
        }
        return valleys;
    }

}
