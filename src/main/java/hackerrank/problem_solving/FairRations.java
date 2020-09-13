package hackerrank.problem_solving;

public class FairRations {
    public static void main(String[] args) {
        System.out.println(fairRations(new int[]{2, 3, 4, 5, 6}));
        System.out.println(fairRations(new int[]{1, 2, 3, 4, 5}));
        System.out.println(fairRations(new int[]{1, 4, 5, 7, 8, 10}));
    }

    static int fairRations(int[] B) {
        int counter = 0;

        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] % 2 != 0) {
                B[i]++;
                B[i+1]++;
                counter += 2;
            }
        }

        if (B[B.length - 1] % 2 == 0) {
            return counter;
        } else {
            System.out.println("NO");
            return 0;
        }
    }
}
