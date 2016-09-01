package solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> DIGIT_VALUES = getDigitValues();

    private static Map<Character, Integer> getDigitValues() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public int romanToInt(String s) {
        int result = DIGIT_VALUES.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int current = DIGIT_VALUES.get(s.charAt(i));
            int previous = DIGIT_VALUES.get(s.charAt(i + 1));
            if (current < previous){
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
