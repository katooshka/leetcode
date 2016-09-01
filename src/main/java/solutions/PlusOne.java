package solutions;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) return digits;
        int carry = 1;
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            carry = 1;
            i--;
        }
        if (i >= 0) {
            digits[i] = digits[i] + 1;
            carry = 0;
        }
        if (carry == 1) {
            int[] digits2 = new int[digits.length + 1];
            System.arraycopy(digits, 0, digits2, 1, digits.length);
            digits2[0] = 1;
            return digits2;
        }
        return digits;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
}
