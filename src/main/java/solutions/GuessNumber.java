package solutions;

public class GuessNumber {

    public int guessNumber(int n) {
        if (n == 1) return 1;
        int start = 0;
        int end = n;
        while (end - start > 1) {
            int half = start + (end - start) / 2;
            if (guess(half) == 1) {
                start = half;
            } else {
                end = half;
            }
        }
        return end;
    }

    private int guess(int n) {
        int number = 2;
        if (n > number) return -1;
        else if (n < number) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumber().guessNumber(1));
    }
}
