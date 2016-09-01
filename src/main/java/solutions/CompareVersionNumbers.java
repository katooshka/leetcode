package solutions;

import java.util.Arrays;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int[] v1 = Arrays.stream(version1.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int[] v2 = Arrays.stream(version2.split("\\.")).mapToInt(Integer::parseInt).toArray();

        int minVersionLength = Math.min(v1.length, v2.length);
        for (int i = 0; i < minVersionLength; i++) {
            if (v1[i] > v2[i]) return 1;
            if (v1[i] < v2[i]) return -1;
        }
        if (v1.length < v2.length && !lastVersionsEqualZero(v2, minVersionLength)) return -1;
        if (v1.length > v2.length && !lastVersionsEqualZero(v1, minVersionLength)) return 1;

        return 0;
    }

    private boolean lastVersionsEqualZero(int[] v, int minVersionLength) {
        return Arrays.stream(v, minVersionLength, v.length).allMatch(x -> x == 0);
    }

    public static void main(String[] args) {
        System.out.println(new CompareVersionNumbers().compareVersion("1.0", "1"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.9.9.9.0", "1.9.9.9"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.9.9.9.1.0", "1.9.9.9"));
    }
}
