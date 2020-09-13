package hackerrank.problem_solving;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
    }

    static String encryption(String s) {
        int rows = 0;
        int columns = 0;
        for (int i = 0; i <= Math.sqrt(s.length()); i++) {
            rows = i;
            if (i == Math.sqrt(s.length())) {
                columns = rows;
            }
        }
        if (rows != columns) {
            columns = rows + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= s.length() - 1; j += columns) {
                if (i + j <= s.length() - 1) {
                    sb.append(s.charAt(i + j));
                }
            }
            sb.append(" ");
        }
        if (sb.toString().charAt(sb.toString().length() - 1) == ' ') {
            sb.deleteCharAt(sb.toString().length() - 1);
        }

        return sb.toString();
    }
}
