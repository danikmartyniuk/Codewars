package hackerrank.problem_solving;

public class AngryProfessor {
    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}));
    }

    static String angryProfessor(int k, int[] a) {
        int counter = 0;
        for (int value : a) {
            if (value <= 0) {
                counter++;
            }
        }
        if (counter < k) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
