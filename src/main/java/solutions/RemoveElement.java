package solutions;

public class RemoveElement {
    private int length;

    public int removeElement(int[] nums, int val) {
        length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                deleteElement(nums, i, val);
            }
        }
        return length;
    }

    private void deleteElement(int[] nums, int i, int val) {
        while (nums[i] == val && length != 0) {
            nums[i] = nums[length - 1];
            length--;
        }
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{4, 5, 6}, 5));
    }
}
