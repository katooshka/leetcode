package solutions;

public class ImplementStrStr {

    private static final char SENTINEL = '\0';

    public int strStrKMP(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) return 0;

        String s = needle + SENTINEL + haystack;
        int haystackShift = needle.length() + 1;

        int[] prefixLengths = prefixFunction(s);
        for (int i = 0; i < prefixLengths.length; i++) {
            if (prefixLengths[i] == needle.length()) {
                int needleStartIndex = i - (needle.length() - 1);
                return needleStartIndex - haystackShift;
            }
        }
        return -1;
    }

    private int[] prefixFunction(String text) {
        int[] prefixLengths = new int[text.length()];
        prefixLengths[0] = 0;
        for (int currentIndex = 1; currentIndex < text.length(); currentIndex++) {
            char currentChar = text.charAt(currentIndex);

            int prefixLength = prefixLengths[currentIndex - 1];
            while (prefixLength > 0 && currentChar != text.charAt(prefixLength)) {
                prefixLength = prefixLengths[prefixLength - 1];
            }
            if (currentChar == text.charAt(prefixLength)) {
                prefixLength++;
            }

            prefixLengths[currentIndex] = prefixLength;
        }
        return prefixLengths;
    }

    public int strStrNaive(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ImplementStrStr().strStrKMP("aaa", "a"));
    }
}
