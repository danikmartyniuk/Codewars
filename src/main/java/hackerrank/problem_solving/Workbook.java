package hackerrank.problem_solving;

public class Workbook {
    public static void main(String[] args) {
        System.out.println(workbook(5, 3, new int[]{4, 2, 6, 1, 10}));
        System.out.println(workbook(10, 5, new int[]{3, 8, 15, 11, 14, 1, 9, 2, 24, 31}));
    }

    static int workbook(int n, int k, int[] arr) {
        int counter = 0;

        int i = 0;
        int pages = 1;
        while (i < n) {
            if (arr[i] <= k) {
                for (int j = 1; j <= arr[i]; j++) {
                    if (j == pages) {
                        counter++;
                    }
                }
                pages++;
                i++;
            }
            else {
                for (int j = 1; j <= arr[i]; j++) {
                    if (j == pages) {
                        counter++;
                    }
                    if (j % k == 0) {
                        pages++;
                    }
                }
                if (arr[i] % k != 0) {
                    pages++;
                }
                i++;
            }
        }

        return counter;
    }
}
