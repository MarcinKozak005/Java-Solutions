package P11_ap_1;

public class P02_scores100 {
    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) if (scores[i] == scores[i + 1] && scores[i] == 100) return true;
        return false;
    }

}
