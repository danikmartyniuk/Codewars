package hackerrank.problem_solving;

public class JumpingOnCloudsRevisited {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        for (int i = 0; i < c.length; i += k, energy--) {
            if (c[i] == 1) {
                energy -= 2;
            }
        }
        return energy;
    }
}
