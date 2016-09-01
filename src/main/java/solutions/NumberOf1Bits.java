package solutions;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if ((n & (1 << i)) != 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(1));
    }
}


