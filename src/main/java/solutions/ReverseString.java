package solutions;

public class ReverseString {
    public static String reverseString(String s) {
        char[] string = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = string[i];
            string[i] = string[string.length - i - 1];
            string[string.length - i - 1] = temp;
        }
        return new String(string);
    }

    public static String reverseString2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseString3(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString4(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1, cp = s.codePointBefore(i); i >= 0; i -= Character.charCount(cp)) {
            sb.append(cp);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        System.out.println(reverseString("hello"));
    }
}
