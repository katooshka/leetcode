package solutions;


public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 0) return null;
        if (n == 1) return "1";
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = next(str);
        }
        return str;
    }

    private String next(String current) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < current.length(); ) {
            int count = countSame(current, i);
            result.append(count).append(current.charAt(i));
            i += count;
        }
        return result.toString();
    }

    private int countSame(String s, int index) {
        int count = 0;
        for (int i = index; i < s.length() && s.charAt(i) == s.charAt(index); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(3));
    }
}
