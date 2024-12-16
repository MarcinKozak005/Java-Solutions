public class P40_Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        boolean[] isAvailable = new boolean[game.length];
        isAvailable[0] = true;
        if (leap >= game.length) return true;
        for (int i = 1; i < game.length; i++) {
            if (
                    game[i] == 0 &&
                            ((i - 1 >= 0 && isAvailable[i - 1]) ||
                                    (i - leap >= 0 && isAvailable[i - leap]))
            ) {
                isAvailable[i] = true;
                int j = i;
                while (j - 1 > 0 && game[j - 1] == 0 && !isAvailable[j - 1]) {
                    isAvailable[j - 1] = true;
                    j--;
                }
                if (i + leap >= game.length) return true;
            }
        }
        return isAvailable[isAvailable.length - 1];
    }
}
