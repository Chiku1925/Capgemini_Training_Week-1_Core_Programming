public class NumberChecker1 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        int[] arr = new int[countDigits(n)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }

    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] d = storeDigits(n);
        int power = d.length;
        int sum = 0;
        for (int digit : d) {
            sum += Math.pow(digit, power);
        }
        return sum == n;
    }

    public static void largestTwo(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        System.out.println("Max: " + max + ", Second Max: " + second);
    }

    public static void smallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        System.out.println("Min: " + min + ", Second Min: " + second);
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Digits Count: " + countDigits(number));
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number));
        largestTwo(digits);
        smallestTwo(digits);
    }
}
