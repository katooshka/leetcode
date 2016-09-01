package solutions;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        if (s.length() == 0) return 0;

        int i = s.length() - 1;
        while (s.charAt(i) == ' ' && i > 0) {
            i--;
        }

        int count = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                return count;
            } else {
                count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
    }
}
