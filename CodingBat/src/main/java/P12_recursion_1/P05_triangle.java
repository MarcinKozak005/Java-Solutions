package P12_recursion_1;

public class P05_triangle {
    public int triangle(int rows) {
        if (rows == 0) return 0;
        if (rows == 1) return 1;
        return rows + triangle(rows - 1);
    }

}
