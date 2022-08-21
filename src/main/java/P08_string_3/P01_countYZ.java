package P08_string_3;

public class P01_countYZ {
    public int countYZ(String str) {
        int count = 0;
        for (String s : str.toLowerCase().split("[^a-z]")) if (s.endsWith("y") || s.endsWith("z")) count++;
        return count;
    }

}
