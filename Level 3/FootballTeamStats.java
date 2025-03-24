import java.util.Random;

public class FootballTeamStats {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101);
        }
        int sum = getSum(heights);
        double mean = getMean(sum, heights.length);
        int min = getMin(heights);
        int max = getMax(heights);

        System.out.println("Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nShortest: " + min);
        System.out.println("Tallest: " + max);
        System.out.printf("Mean: %.2f\n", mean);
    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int i : a) sum += i;
        return sum;
    }

    public static double getMean(int sum, int n) {
        return (double) sum / n;
    }

    public static int getMin(int[] a) {
        int min = a[0];
        for (int i : a) if (i < min) min = i;
        return min;
    }

    public static int getMax(int[] a) {
        int max = a[0];
        for (int i : a) if (i > max) max = i;
        return max;
    }
}
