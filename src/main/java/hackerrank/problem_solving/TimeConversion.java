package hackerrank.problem_solving;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    static String timeConversion(String s) {
        String midnight = s.substring(s.length() - 2);
        if (midnight.equals("PM")) {
            if (s.substring(0, 2).equals("12")) {
                return s.substring(0, s.length() - 2);
            } else {
                return Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, s.length() - 2);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                return s.replace("12", "00").replace(midnight, "");
            } else {
                return s.replace(midnight, "");
            }
        }
    }
}
