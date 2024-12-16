public class P37_JavaGenerics {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"Hello", "World"});
    }

}
