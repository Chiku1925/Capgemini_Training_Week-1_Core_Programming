public class NumberFactors {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[j++] = i;
        }
        return factors;
    }

    public static int getGreatestFactor(int[] f, int n) {
        int max = 1;
        for (int i : f) {
            if (i < n && i > max) max = i;
        }
        return max;
    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int i : a) sum += i;
        return sum;
    }

    public static int getProduct(int[] a) {
        int prod = 1;
        for (int i : a) prod *= i;
        return prod;
    }

    public static double getCubeProduct(int[] a) {
        double prod = 1;
        for (int i : a) prod *= Math.pow(i, 3);
        return prod;
    }

    public static boolean isPerfect(int n) {
        int[] f = getFactors(n);
        int sum = 0;
        for (int i : f) {
            if (i != n) sum += i;
        }
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int[] f = getFactors(n);
        int sum = 0;
        for (int i : f) if (i != n) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int[] f = getFactors(n);
        int sum = 0;
        for (int i : f) if (i != n) sum += i;
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return sum == temp;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int num = 28;
        int[] f = getFactors(num);
        System.out.println("Greatest Factor: " + getGreatestFactor(f, num));
        System.out.println("Sum: " + getSum(f));
        System.out.println("Product: " + getProduct(f));
        System.out.println("Cube Product: " + getCubeProduct(f));
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }
}
