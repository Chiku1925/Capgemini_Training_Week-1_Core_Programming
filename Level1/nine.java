import java.util.*;

public class nine {

    static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s1 = input.nextLine();

        String upperCaseBuiltIn = s1.toUpperCase();
        String upperCaseCustom = convertToUpperCase(s1);

        boolean isEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        System.out.println("Built-in toUpperCase: " + upperCaseBuiltIn);
        System.out.println("Custom Conversion: " + upperCaseCustom);
        System.out.println("Are they equal? " + isEqual);
    }
}
