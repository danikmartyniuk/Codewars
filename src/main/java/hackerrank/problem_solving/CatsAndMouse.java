package hackerrank.problem_solving;

public class CatsAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(2, 5, 4));
    }

    /**
     * @param x - cat A
     * @param y - cat B
     * @param z - mouse C
     * @return who will win
     */

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(z - x) < Math.abs(z - y)) {
            return "Cat A";
        } else if (Math.abs(z - x) > Math.abs(z - y)) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

}
