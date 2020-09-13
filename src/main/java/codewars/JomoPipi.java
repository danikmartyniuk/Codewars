package codewars;

public class JomoPipi {

    public static void main(String[] args) {
        System.out.println(stringFunc("String for test: incommensurability", 1));
    }

    public static String stringFunc(String s, long x) {
        StringBuilder str = new StringBuilder(s);
        String newString = "";
        for (long i = 0; i < x; i++) {
            for (long j = 0; j < str.length(); j++) {
                newString = str.toString().substring((int) i);
                newString = reverse(newString);
            }
        }
        return newString;
    }

    public static String reverse (String str) {
        StringBuilder newString = new StringBuilder();
        for (long i = str.length() - 1; i >= 0; i--) {
            newString.append(str.charAt((int) i));
        }
        return newString.toString();
    }
}
