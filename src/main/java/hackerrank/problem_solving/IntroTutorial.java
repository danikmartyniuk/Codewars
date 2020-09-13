package hackerrank.problem_solving;

public class IntroTutorial {
    public static void main(String[] args) {
        System.out.println(introTutorial(4, new int[]{1, 4, 5, 7, 9, 12}));
    }

    static int introTutorial(int V, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                return i;
            }
        }
        return -1;
    }
}
