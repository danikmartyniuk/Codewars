package hackerrank.mathematics;

public class CuttingPaperSquares {
    public static void main(String[] args) {
        System.out.println(solve(3, 1));
        System.out.println(solve(12, 12));
        System.out.println(solve(689715240, 759842301));
    }

    static long solve(int n, int m) {
        return (long) m - 1 + (long) m * ((long) n - 1);
    }
}
