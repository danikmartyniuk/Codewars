package hackerrank.problem_solving;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
    }

    static String dayOfProgrammer(int year) {
        StringBuilder date = new StringBuilder();
        if (year == 1918) {
            date.append("26.09.").append(year);
        } else if (year > 1918) {
            if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
                date.append("12.09.").append(year);
            } else {
                date.append("13.09.").append(year);
            }
        } else {
            if (year % 4 == 0) {
                date.append("12.09.").append(year);
            } else {
                date.append("13.09.").append(year);
            }
        }
        return date.toString();
    }

}
