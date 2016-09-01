package solutions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!first.containsKey(c)) {
                first.put(c, 0);
            }
            first.put(c, first.get(c) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!second.containsKey(c)) {
                second.put(c, 0);
            }
            second.put(c, second.get(c) + 1);
        }
        return first.equals(second);
    }

    public boolean isAnagramAscii(String s, String t) {
        int[] charCount = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) return false;
        }
        return true;
    }
}
