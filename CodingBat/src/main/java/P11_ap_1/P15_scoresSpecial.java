package P11_ap_1;

import java.util.Arrays;

public class P15_scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return Arrays.stream(a).filter(n -> n % 10 == 0).max().orElse(0) +
                Arrays.stream(b).filter(n -> n % 10 == 0).max().orElse(0);
    }

}
