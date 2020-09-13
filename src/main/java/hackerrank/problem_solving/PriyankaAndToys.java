package hackerrank.problem_solving;

public class PriyankaAndToys {
    public static void main(String[] args) {
        System.out.println(toys(new int[]{1, 2, 3, 17, 10}));
        System.out.println(toys(new int[]{12, 15, 7, 8, 19, 24}));
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));
    }

    static int toys(int[] w) {
        int money = 1;
        boolean isChecked = true;

        for (int i = 0; i < w.length - 1; i++) {
            for (int a = w[i]; a <= w[i] + 4; a++) {
                if (a == w[i+1]) {
                    isChecked = true;
                    break;
                } else {
                    isChecked = false;
                }
            }
            if (!isChecked) {
                money++;
            }
        }
        return money;
    }
}
