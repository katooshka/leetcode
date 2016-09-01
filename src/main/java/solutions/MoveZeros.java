package solutions;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int indexToPut = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexToPut] = nums[i];
                indexToPut++;
            }
        }
        for (int i = indexToPut; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 0, 0, 0, 3, 0, 4, 5, 6, 0, 7, 0, 0, 8, 9, 0};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
