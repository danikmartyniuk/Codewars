package hackerrank.problem_solving;

public class TimeInWords {
    public static void main(String[] args) {
        System.out.println(timeInWords(7, 29));
    }

    static String timeInWords(int h, int m) {
        StringBuilder time = new StringBuilder();
        String[] min = {
                "o' clock",
                "past",
                "quarter",
                "to",
                "minutes",
                "twenty",
                "half",
                "minute"
        };
        String[] numNames = {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
        };

        if (m == 00) {
            time.append(numNames[h]).append(" ").append(min[0]);
        } else if (m == 30) {
            time.append(min[6]).append(" ").append(min[1]).append(" ").append(numNames[h]);
        } else if (m == 45 | m == 15) {
            if (m == 45) {
                time.append(min[2]).append(" ").append(min[3]).append(" ").append(numNames[h + 1]);
            } else {
                time.append(min[2]).append(" ").append(min[1]).append(" ").append(numNames[h]);
            }
        } else if (m < 30) {
            if (m < 10) {
                time.append(numNames[m]).append(" ").append(min[7]).append(" ").append(min[1]).append(" ").append(numNames[h]);
            } else if (m > 20) {
                time.append(min[5]).append(" ").append(numNames[m - 20]).append(" ").append(min[4]).append(" ").append(min[1]).append(" ").append(numNames[h]);
            } else if (m == 20) {
                time.append(min[5]).append(" ").append(min[4]).append(" ").append(min[1]).append(" ").append(numNames[h]);
            }
            else {
                time.append(numNames[m]).append(" ").append(min[4]).append(" ").append(min[1]).append(" ").append(numNames[h]);
            }
        } else if (m > 30) {
            if (m < 40) {
                time.append(min[5]).append(" ").append(numNames[40 - m]).append(" ").append(min[4]).append(" ").append(min[3]).append(" ").append(numNames[h + 1]);
            } else if (m == 40) {
                time.append(min[5]).append(" ").append(min[4]).append(" ").append(min[3]).append(" ").append(numNames[h + 1]);
            } else {
                time.append(numNames[60-m]).append(" ").append(min[4]).append(" ").append(min[3]).append(" ").append(numNames[h + 1]);
            }
        }

        return time.toString();
    }
}
