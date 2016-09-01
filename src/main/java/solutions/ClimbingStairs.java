package solutions;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return countOptions(n);
    }

    private int countOptions(int n) {
        int first = 1;
        int second = 2;
        for (int i = 2; i < n; i++) {
            int newFirst = second;
            second = first + second;
            first = newFirst;
        }
        return second;
    }

    public static void main(String[] args){
        System.out.println(new ClimbingStairs().climbStairs(0));
        System.out.println(new ClimbingStairs().climbStairs(1));
        System.out.println(new ClimbingStairs().climbStairs(2));
        System.out.println(new ClimbingStairs().climbStairs(3));
        System.out.println(new ClimbingStairs().climbStairs(4));
        System.out.println(new ClimbingStairs().climbStairs(5));
        System.out.println(new ClimbingStairs().climbStairs(6));
    }
}
