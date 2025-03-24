public class MatrixOperations {
    public static int[][] generate(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) t[j][i] = a[i][j];
        return t;
    }

    public static void display(int[][] a) {
        for (int[] row : a) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = generate(2, 2);
        int[][] b = generate(2, 2);
        System.out.println("Matrix A:");
        display(a);
        System.out.println("Matrix B:");
        display(b);
        System.out.println("Addition:");
        display(add(a, b));
        System.out.println("Subtraction:");
        display(subtract(a, b));
        System.out.println("Multiplication:");
        display(multiply(a, b));
        System.out.println("Transpose of A:");
        display(transpose(a));
    }
}
