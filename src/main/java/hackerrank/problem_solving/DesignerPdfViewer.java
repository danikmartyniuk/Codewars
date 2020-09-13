package hackerrank.problem_solving;

import java.util.Arrays;

public class DesignerPdfViewer {
    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"));
    }

    static int designerPdfViewer(int[] h, String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] heights = new int[word.length()];
        for (int j = 0; j < word.length(); j++) {
            for (int i = 0; i < alphabet.length(); i++) {
                if (alphabet.charAt(i) == word.charAt(j)) {
                    heights[j] = h[i];
                }
            }
        }
        Arrays.sort(heights);
        return word.length() * heights[heights.length - 1];
    }
}
