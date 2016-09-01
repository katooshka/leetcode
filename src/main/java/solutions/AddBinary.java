package solutions;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder r = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int da = getDigitFromBack(a, i);
            int db = getDigitFromBack(b, i);
            int sum = da + db + carry;
            r.append(digitToChar(sum % 2));
            carry = sum / 2;
        }
        if (carry != 0) {
            r.append(digitToChar(carry));
        }
        return r.reverse().toString();
    }

    private int getDigitFromBack(String a, int i) {
        return i < a.length() ? charToDigit(a.charAt(a.length() - i - 1)) : 0;
    }

    private char digitToChar(int digit) {
        return (char) (digit + '0');
    }

    private int charToDigit(char ch) {
        return ch - '0';
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("101111", "10"));
    }
}
