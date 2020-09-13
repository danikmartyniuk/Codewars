package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Collections;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length) {
            return 0;
        } else {
            ArrayList<Integer> maxDist = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ArrayList<Integer> distances = new ArrayList<>();
                boolean isSpaceStation = false;
                for (int item : c) {
                    if (i == item) {
                        isSpaceStation = true;
                        break;
                    }
                }

                if (!isSpaceStation) {
                    for (int value : c) {
                        distances.add(Math.abs(value - i));
                    }
                    Collections.sort(distances);
                    maxDist.add(distances.get(0));
                }
            }

            Collections.sort(maxDist);
            return maxDist.get(maxDist.size() - 1);
        }
    }

}
