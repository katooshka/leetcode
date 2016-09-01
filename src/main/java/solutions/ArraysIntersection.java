package solutions;

import java.util.*;

public class ArraysIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<Integer>();
        for (int i : nums1) {
            first.add(i);
        }
        Set<Integer> second = new HashSet<Integer>();
        for (int i : nums2) {
            second.add(i);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (Integer integer : second) {
            if (first.contains(integer)) {
                list.add(integer);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
