package hackerrank.mathematics;

public class HalloweenParty {
    public static void main(String[] args) {
        System.out.println(halloweenParty(6));
    }

    static long halloweenParty(int k) {
        long w = 0;
        long v = 0;
        for (int i = 0; i < (long) k; i++) {
            if (i % 2 == 0) {
                w++;
            } else {
                v++;
            }
        }
        return w * v;
    }
}
