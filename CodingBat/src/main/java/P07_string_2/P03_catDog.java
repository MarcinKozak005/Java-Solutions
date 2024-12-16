package P07_string_2;

public class P03_catDog {
    public boolean catDog(String str) {
        // for newer versions of java can be done using Pattern & Matcher
        int c_cat = 0;
        int c_dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("dog", i)) c_dog++;
            if (str.startsWith("cat", i)) c_cat++;
        }
        return c_dog == c_cat;

    }

}
