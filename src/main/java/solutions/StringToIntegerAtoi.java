package solutions;

public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;

        int index = firstNonSpace(s);
        if (index == s.length()) return 0;

        int sign = 1;
        if (isSign(s.charAt(index))) {
            sign = getSign(s.charAt(index));
            index++;
        }
        if (index >= s.length() || !isDigit(s.charAt(index))) return 0;

        int result = 0;
        for (; index < s.length() && isDigit(s.charAt(index)); index++) {
            int digit = getDigit(s.charAt(index));
            if (sign == 1 && result > (Integer.MAX_VALUE - digit) / 10) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && result < (Integer.MIN_VALUE + digit) / 10) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + sign * digit;
        }
        return result;
    }

    private int getSign(char sign) {
        return sign == '+' ? 1 : -1;
    }

    private int getDigit(char c) {
        return c - '0';
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isSign(char c) {
        return c == '+' || c == '-';
    }

    private int firstNonSpace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(new StringToIntegerAtoi().myAtoi(String.format("    %dsdsvdasd", Integer.MIN_VALUE)));
    }
}
