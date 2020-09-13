package hackerrank.problem_solving;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }

    static int jumpingOnClouds(int[] c) {
        int counter = -1;
        for (int i = 0; i < c.length; i++) {

            if (i == c.length - 2) {
                if (c[i] == 1) {
                } else {
                    counter++;
                }
            } else if (i == c.length - 1) {
                counter++;
                break;
            } else if (c[i] == 1) {
            } else {
                counter++;
                if (c[i+2] != 1) {
                    i++;
                }
            }
        }
        return counter;
    }
}
