package solutions;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            } else if (nums[i] == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public int majorityElementBitMajors(int[] nums) {
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            int zeroes = 0;
            for (int num : nums) {
                if ((num & (1 << i)) == 0) {
                    zeroes++;
                }
            }
            int bit = zeroes > nums.length / 2 ? 0 : 1;
            result = result | bit << i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{1}));
    }
}

