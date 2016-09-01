package solutions;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            }
        }
        return true;
    }
}
