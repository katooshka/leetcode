package solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        if (n == 0) return false;
        while (n != 1) {
            n = findSquaredDigitsSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int findSquaredDigitsSum(int n) {
        int result = 0;
        while (n > 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(7));
    }
}
