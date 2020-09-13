package codewars;

public class Parser {

    public static void main(String[] args) {
        System.out.println(parseInt("one") + ", " + parseInt("two hundred forty-six"));
    }

    public static int parseInt(String numStr) {

        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] others = {"hundred", "thousand"};

        int number = 0;
        String[] userInput = numStr.split(" ");
        int[] indexes;
        for (int i = 0; i < ones.length; i++) {
            if (ones[i].equals(userInput)) {

            }
        }
        return number;
    }
}
