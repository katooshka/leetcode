package solutions;

public class ReverseInteger {

    public int reverse(int x) {
        if (x == 0) return 0;
        if (x == Integer.MIN_VALUE) return 0;  // so that we can safely negate x

        boolean isNegative = x < 0;
        x = Math.abs(x);

        int result = 0;
        while (x != 0){
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }

            result = result * 10 + x % 10;
            x = x / 10;
        }

        return isNegative ? -result : result;
    }


    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-13));
        System.out.println(new ReverseInteger().reverse(-2147483648));
        System.out.println(new ReverseInteger().reverse(12));
        System.out.println(new ReverseInteger().reverse(1));
        System.out.println(new ReverseInteger().reverse(0));
    }
}
