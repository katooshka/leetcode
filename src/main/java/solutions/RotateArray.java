package solutions;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length == 1 || k == 0) {
            return;
        }
        rotateArrayPart(0, nums.length , nums);
        rotateArrayPart(0, k, nums);
        rotateArrayPart(k, nums.length, nums);
    }

    private void rotateArrayPart(int start, int end, int[] nums) {
        for (int i = 0; i < (end - start) / 2; i++) {
            swap(nums, start + i, end - i - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        new RotateArray().rotate(array, 1);
        System.out.println(Arrays.toString(array));
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        new RotateArray().rotateArrayPart(3, 7, nums);
        System.out.println(Arrays.toString(nums));
    }
}
