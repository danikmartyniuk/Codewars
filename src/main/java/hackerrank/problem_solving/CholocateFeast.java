package hackerrank.problem_solving;

public class CholocateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(6, 2, 2));
    }

    static int chocolateFeast(int n, int c, int m) {
        if (n / c < m) {
            return n / c;
        } else {
            int newWrappers = n / c;
            int total = newWrappers;
            do {
                newWrappers -= m;
                newWrappers++;
                total++;
            } while (newWrappers >= m);
            return total;
        }
    }
}
