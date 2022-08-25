package P11_ap_1;

public class P19_userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) == 0) return (int) Math.signum(Integer.compare(aId, bId));
        return (int) Math.signum(aName.compareTo(bName));
    }

}
