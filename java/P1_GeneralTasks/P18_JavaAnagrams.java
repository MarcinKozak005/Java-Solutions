public class P18_JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) return false;
        java.util.List<Character> aList = new java.util.LinkedList<>();
        for (char aElem : a.toCharArray()) aList.add(aElem);
        for (Character bElem : b.toCharArray()) {
            if (!aList.remove(bElem)) return false;
        }
        return true;
    }
}
