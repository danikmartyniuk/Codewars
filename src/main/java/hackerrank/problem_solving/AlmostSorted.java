package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class AlmostSorted {
    public static void main(String[] args) {
        almostSorted(new int[]{1, 2, 3, 9, 5, 6, 7, 8, 4});
        almostSorted(new int[]{4, 2});
        almostSorted(new int[]{1, 5, 4, 3, 2, 6});
        almostSorted(new int[]{3, 1, 2});
    }

    static void almostSorted(int[] arr) {
        StringBuilder answer = new StringBuilder();
        int[] initialArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);

        int counter = 0;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != initialArray[i]) {
                counter++;
                indexes.add(i);
            }
        }

        if (counter == 2) {
            swap(initialArray, indexes.get(0), indexes.get(1));
            answer.append("yes\n").append("swap ").append(indexes.get(0) + 1).append(" ").append(indexes.get(1) + 1);
        }
        else if (counter > 2) {
            int[] reversedArray = reverse(Arrays.copyOfRange(initialArray, indexes.get(0), indexes.get(indexes.size() - 1) + 1));
            if (indexes.get(indexes.size() - 1) + 1 - indexes.get(0) >= 0)
                System.arraycopy(reversedArray, 0, initialArray, indexes.get(0), indexes.get(indexes.size() - 1) + 1 - indexes.get(0));
            answer.append("yes\n").append("reverse ").append(indexes.get(0) + 1).append(" ").append(indexes.get(indexes.size() - 1) + 1);
        }

        boolean isRightSorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != initialArray[i]) {
                isRightSorted = false;
                break;
            }
        }

        if (isRightSorted) {
            System.out.println(answer.toString());
        } else {
            System.out.println("no");
        }

    }

    public static int[] reverse (int[] array) {
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length -i -1] = temp;
        }
        return array;
    }

    public static void swap (int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
