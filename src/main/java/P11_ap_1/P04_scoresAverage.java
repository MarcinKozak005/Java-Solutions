package P11_ap_1;

public class P04_scoresAverage {
    public int scoresAverage(int[] scores) {
        return Math.max(
                average(scores, 0, scores.length / 2),
                average(scores, scores.length / 2, scores.length)
        );
    }

    int average(int[] scores, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) result += scores[i];
        return result / (end - start);
    }

}
