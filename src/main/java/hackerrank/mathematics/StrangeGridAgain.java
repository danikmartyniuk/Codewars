package hackerrank.mathematics;

public class StrangeGridAgain {
    public static void main(String[] args) {
        System.out.println(strangeGrid(6, 3));
        System.out.println(strangeGrid(2, 4));
    }

    static int strangeGrid(int r, int c) {
        int index = (r - 1) * 5 + c;
        int[] arr = new int[index];
        arr[0] = 0;
        int startEven = 10;
        int startOdd = 1;
        for (int i = 1; i < arr.length; i++) {
            int lastDigit = Integer.toString(i).split("").length - 1;
            if (Integer.toString(i).split("")[lastDigit].equals("0")) {
                arr[i] = startEven;
                startEven += 10;
            } else if (Integer.toString(i).split("")[lastDigit].equals("5")){
                arr[i] = startOdd;
                startOdd += 10;
            } else {
                arr[i] = arr[i - 1] + 2;
            }
        }
        return arr[arr.length - 1];
    }
}
