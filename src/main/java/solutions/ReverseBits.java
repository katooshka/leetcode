package solutions;

public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if (getBit(n, i)) {
                result = turnBitOn(result, Integer.SIZE - 1 - i);
            }
        }
        return result;
    }

    private static boolean getBit(int number, int index) {
        return (number & (1 << index)) != 0;
    }

    private static int turnBitOn(int number, int index) {
        return number | 1 << index;
    }

    public static int reverseBits2(int n) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            int bit = (n & (1 << i)) >> i; // 0 or 1
            result |= bit << (31 - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }
}
