package hackerrank.problem_solving;

public class BeautifulPairs {
    public static void main(String[] args) {
        System.out.println(beautifulPairs(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 3, 6}));
    }

    static int beautifulPairs(int[] A, int[] B) {
        boolean[] isChecked = new boolean[A.length];
        int counter = 0;
        for (int value : A) {
            for (int j = 0; j < B.length; j++) {
                if (value == B[j] & !isChecked[j]) {
                    isChecked[j] = true;
                    break;
                }
            }
        }
        for (boolean b : isChecked) {
            if (b) {
                counter++;
            }
        }
        return counter + 1;
    }

}
