package P10_array_3;

public class P05_linearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int o = 0;
        while (i < inner.length && o < outer.length) {
            if (outer[o] < inner[i]) o++;
            else if (outer[o] == inner[i]) {
                o++;
                i++;
            } else return false;
        }
        return i == inner.length;
    }

}
