package hackerrank.problem_solving;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
    public static void main(String[] args) {
        staircase(5);
    }

    static void staircase(int n) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            finalString.append(IntStream.range(0, n - i).mapToObj(j -> " ").collect(Collectors.joining(""))).append(IntStream.range(0, i).mapToObj(k -> "#").collect(Collectors.joining(""))).append("\n");
        }
        System.out.println(finalString.toString().substring(0, finalString.toString().length() - 1));
    }
}
