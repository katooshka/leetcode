package solutions;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if (n < 0) return false;

        int numberOfOne = 0;
        for (int i = 0; i < Integer.SIZE ; i++) {
            if ((n & (1 << i)) != 0) {
                numberOfOne++;
            }
        }
        return numberOfOne == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args){
        System.out.println(new PowerOfTwo().isPowerOfTwo(1));
    }
}
