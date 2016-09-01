package solutions;

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        while (a != 0 && b != 0) {
            int tempB = b;
            b = sumWithoutCarry(a, b);
            a = carry(a, tempB);
        }
        return a == 0 ? b : a;
    }

    private int sumWithoutCarry(int a, int b) {
        return a ^ b;
    }

    public int getSumRecursive(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        int sumWithoutCarry = sumWithoutCarry(a, b);
        int carry = carry(a, b);

        return getSum(carry, sumWithoutCarry);
    }

    private int carry(int a, int b) {
        return (a & b) << 1;
    }
}
