package solutions;

import java.util.*;

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        if (guess == null || secret == null) return null;

        int bulls = getBulls(secret, guess);

        Map<Character, Integer> secretCharCounts = getCharCounts(secret);
        Map<Character, Integer> guessCharCounts = getCharCounts(guess);

        int bullsAndCows =  getBullsAndCows(secretCharCounts, guessCharCounts);

        return String.format("%dA%dB", bulls, bullsAndCows - bulls);
    }

    private int getBulls(String secret, String guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }
        }
        return bulls;
    }

    private Map<Character, Integer> getCharCounts(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    private int getBullsAndCows(Map<Character, Integer> secretCharCounts, Map<Character, Integer> guessCharCounts) {
        int result = 0;
        for (Map.Entry<Character, Integer> entry : guessCharCounts.entrySet()) {
            char c = entry.getKey();
            int guessCharCount = entry.getValue();
            if (guessCharCounts.containsKey(c)){
                result += Math.min(guessCharCount, secretCharCounts.get(c));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new BullsAndCows().getHint("1807", "7810"));
    }
}
