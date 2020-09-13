package hackerrank.problem_solving;

public class BeautifulTriplets {
    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
        System.out.println(beautifulTriplets(2, new int[]{1, 2, 3, 4, 5, 6}));
    }

    static int beautifulTriplets(int d, int[] arr) {
        int triplets = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + d == arr[j]) {
                    arr[i] += d;
                    counter++;
                }
            }
            if (counter >= 3) {
                triplets++;
            }
        }
        return triplets;
    }
}
