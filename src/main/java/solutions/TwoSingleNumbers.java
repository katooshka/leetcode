package solutions;

public class TwoSingleNumbers {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff = diff ^ num;
        }
        int diffBitIndex = getFirstEnabledBitIndex(diff);

        int r1 = 0;
        int r2 = 0;
        for (int num : nums) {
            if (getBit(num, diffBitIndex)){
                r1 = r1 ^ num;
            } else {
                r2 = r2 ^ num;
            }
        }
        return new int[]{r1, r2};
    }

    private int getFirstEnabledBitIndex(int x) {
        for (int i = 0; i < 32; i++) {
            if (getBit(x, i)) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean getBit(int x, int i) {
        return  (x & (1 << i)) == 0;
    }
}
