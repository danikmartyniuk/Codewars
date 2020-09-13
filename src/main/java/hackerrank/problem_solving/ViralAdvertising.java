package hackerrank.problem_solving;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    static int viralAdvertising(int n) {
        int likes = 0;
        int people = 5;
        for (int i = 0; i < n; i++) {
            likes += people / 2;
            people = (people / 2) * 3;
        }
        return likes;
    }
}
