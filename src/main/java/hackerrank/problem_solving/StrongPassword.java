package hackerrank.problem_solving;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(11, "#HackerRank"));
    }

    static int minimumNumber(int n, String password) {
        int counter = 0;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean[] doesContain = new boolean[4];
        doesContain[0] = containsSymbol(numbers, password);
        doesContain[1] = containsSymbol(lower_case, password);
        doesContain[2] = containsSymbol(upper_case, password);
        doesContain[3] = containsSymbol(special_characters, password);

        for (boolean b : doesContain) {
            if (!b) {
                counter++;
            }
        }

        if (n < 6 & 6 - n > counter) {
            return 6 - n;
        } else {
            return counter;
        }

    }

    public static boolean containsSymbol (String c, String password) {
        for (int i = 0; i < c.length(); i++) {
            if (password.contains(String.valueOf(c.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

}
