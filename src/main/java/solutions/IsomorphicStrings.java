package solutions;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        return isMapping(s, t) && isMapping(t, s);
    }

    private boolean isMapping(String from, String to) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < from.length(); i++) {
            if (map.containsKey(from.charAt(i))){
                if (map.get(from.charAt(i)) != to.charAt(i)){
                    return false;
                }
            } else {
                map.put(from.charAt(i), to.charAt(i));
            }
        }
        return true;
    }
}
