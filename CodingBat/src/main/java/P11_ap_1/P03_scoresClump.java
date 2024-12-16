package P11_ap_1;

public class P03_scoresClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++)
            if (scores[i] + 2 >= scores[i + 1] && scores[i] + 2 >= scores[i + 2] && scores[i + 1] <= scores[i + 2])
                return true;
        return false;
    }

}
