package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
        System.out.println(birthday(s, 3, 2));
        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(birthday(Collections.singletonList(4), 4, 1));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;

        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (i + j >= s.size()) {
                    continue;
                }
                sum += s.get(i + j);
            }
            if (sum == d) {
                counter++;
            }
        }

        return counter;
    }
}
