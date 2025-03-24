public class StudentScoreCard {
    public static void main(String[] args) {
        int n = 5;
        int[][] scores = new int[n][3];
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + (int)(Math.random() * 60);
            scores[i][1] = 40 + (int)(Math.random() * 60);
            scores[i][2] = 40 + (int)(Math.random() * 60);
        }

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            result[i][0] = total;
            result[i][1] = total / 3.0;
            result[i][2] = (total / 300.0) * 100;
        }

        System.out.println("Phy Chem Math Total Avg %");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d %4d %4d %5.0f %5.2f %5.2f\n", scores[i][0], scores[i][1], scores[i][2],
                    result[i][0], result[i][1], result[i][2]);
        }
    }
}
