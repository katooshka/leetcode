package solutions;

public class UglyNumber {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        num = divideByMaxPowerOf(divideByMaxPowerOf(divideByMaxPowerOf(num, 2), 3), 5);
        return num == 1;
    }

    private int divideByMaxPowerOf(int num, int divider){
        while (num % divider == 0) {
            num = num / divider;
        }
        return num;
    }
}
