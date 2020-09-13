package hackerrank.problem_solving;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BigSorting {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bigSorting(new String[]
                {"1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200"})));
    }

    static String[] bigSorting(String[] unsorted) {
        ArrayList<BigInteger> notStringArray = new ArrayList<>();
        for (String s : unsorted) {
            notStringArray.add(new BigInteger(s));
        }
        Collections.sort(notStringArray);
        String[] sorted = new String[notStringArray.size()];
        for (int i = 0; i < notStringArray.size(); i++) {
            sorted[i] = String.valueOf(notStringArray.get(i));
        }
        return sorted;
    }

}
