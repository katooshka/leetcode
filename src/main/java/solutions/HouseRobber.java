package solutions;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] robSum = new int[nums.length];
        robSum[0] = nums[0];
        robSum[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            robSum[i] = Math.max(nums[i] + robSum[i - 2], robSum[i - 1]);
        }
        return robSum[robSum.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[]{2, 1, 1, 1}));
    }
}
