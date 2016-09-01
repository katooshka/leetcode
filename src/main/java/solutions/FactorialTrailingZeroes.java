package solutions;


public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int result = 0;
        int count = n / 5;
        while (count > 0) {
            result += count;
            count /= 5;
        }
        return result;
    }

    public int trailingZeroes2(int n) {
        int numberOfTwo = 0;
        int numberOfFive = 0;
        for (int i = n; i >= 1; i--) {
            numberOfTwo += findDiv(i, 2);
            numberOfFive += findDiv(i, 5);
        }
        return Math.min(numberOfTwo, numberOfFive);
    }

    private int findDiv(int n, int d) {
        int result = 0;
        while (n % d == 0) {
            result++;
            n = n / d;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(26));
    }

}
