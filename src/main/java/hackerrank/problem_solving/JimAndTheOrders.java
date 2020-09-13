package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JimAndTheOrders {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(jimOrders(new int[][]{{8,1},{4,2},{5,6},{3,1},{4,3}})));
    }

    static int[] jimOrders(int[][] orders) {
        int[] times = new int[orders.length];
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            times[i] = orders[i][0] + orders[i][1];
        }
        return orderIndexAscending(times);
    }

    static int[] orderIndexAscending(int[] array) {
        int[] minimumIndexes = new int[array.length];
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        Set<Integer> savedIndexes = new HashSet<>();

        for (int index = 0; index < array.length; index++){
            int minIndex = 0;
            for (int number : array) {
                if (number == sortedArray[index] && !savedIndexes.contains(minIndex)) {
                    savedIndexes.add(minIndex);
                    minimumIndexes[index] = minIndex + 1;
                    break;
                }
                minIndex++;
            }
        }
        return minimumIndexes;
    }

}
