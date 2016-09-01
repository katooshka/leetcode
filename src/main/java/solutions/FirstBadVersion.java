package solutions;

public class FirstBadVersion {
    private boolean[] badVersions = new boolean[]{false, true, true}; // for test

    public int firstBadVersion(int n) {
        int start = 0;
        int finish = n + 1;

        while (finish - start > 1) {
            int half = start + (finish - start) / 2;
            if (isBadVersion(half)) {
                finish = half;
            } else {
                start = half;
            }
        }
        return finish;
    }

    boolean isBadVersion(int version) {
        return badVersions[version - 1];
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(3));
    }
}
