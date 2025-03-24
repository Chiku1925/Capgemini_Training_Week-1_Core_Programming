import java.util.Random;

public class OTPGenerator {
    public static int generateOTP() {
        Random r = new Random();
        return 100000 + r.nextInt(900000);
    }

    public static boolean checkUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All OTPs Unique: " + checkUnique(otps));
    }
}
