package P11_ap_1;

public class P13_scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (key[i].equals(answers[i])) score += 4;
            else if (answers[i].equals("?")) ;
            else score -= 1;
        }
        return score;
    }

}
