package solutions;

import java.util.Arrays;

public class SubArraySum {
    private final int[] nums;

    public SubArraySum(int[] nums) {
        this.nums = Arrays.copyOf(nums, nums.length);
        for (int k = 1; k < this.nums.length; k++) {
            this.nums[k] += this.nums[k - 1];
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? nums[j] : nums[j] - nums[i - 1];
    }

    public static void main(String[] args) {
        SubArraySum array = new SubArraySum(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(array.sumRange(2, 5));
        System.out.println(array.sumRange(0, 2));
        System.out.println(array.sumRange(0, 5));
    }
}
