package solutions;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 1) return 1;
        int indexToPut = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[indexToPut] = nums[i];
                indexToPut++;
            }
        }
        return indexToPut;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1}));
    }
}
