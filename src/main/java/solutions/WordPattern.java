package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        List<String> words = Arrays.asList(str.split(" "));
        if (pattern.length() != words.size()) return false;
        List<Character> characters = pattern.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        return isMapping(characters, words) && isMapping(words, characters);
    }

    private <K, V> boolean isMapping(List<K> pattern, List<V> str) {
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < pattern.size(); i++) {
            if (map.containsKey(pattern.get(i))) {
                if (!map.get(pattern.get(i)).equals(str.get(i))) {
                    return false;
                }
            } else {
                map.put(pattern.get(i), str.get(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog cat dog dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
    }
}
