package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntesection2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> second = new HashMap<>();
        for (int i : nums1) {
            if (!first.containsKey(i)){
                first.put(i, 0);
            }
            first.put(i, first.get(i) + 1);
        }
        for (int i : nums2) {
            if (!second.containsKey(i)){
                second.put(i, 0);
            }
            second.put(i, second.get(i) + 1);
        }
        List<Integer> intersection = new ArrayList<>();
        for (Integer integer : first.keySet()) {
            if (second.containsKey(integer)){
                for (int i = 0; i < Math.min(first.get(integer), second.get(integer)); i++) {
                    intersection.add(integer);
                }
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
