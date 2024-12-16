import java.util.List;
import java.util.Objects;

public class D02P01_LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        int i, j;
        for (i = 0; i < a.size(); i++) {
            for (j = 0; j < a.size(); j++) {
                if (i != j && Objects.equals(a.get(i), a.get(j))) break;
            }
            if (j == a.size()) break;
        }
        return a.get(i);
    }

}
