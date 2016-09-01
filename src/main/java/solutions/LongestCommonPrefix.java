package solutions;

import static java.util.Arrays.stream;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minLength = stream(strs).mapToInt(String::length).min().getAsInt();

        int substringEnd = 0;
        for (int i = 0; i < minLength; i++) {
            if (!kthCharsEqual(strs, i)) {
                return strs[0].substring(0, substringEnd);
            }
            substringEnd++;
        }
        return strs[0].substring(0, substringEnd);
    }

    private boolean kthCharsEqual(String[] strs, int k) {
        return stream(strs).map(s -> s.charAt(k)).distinct().count() == 1;
    }
}
