package solutions;

public class ZigZagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int period = numRows * 2 - 2;

        for (int i = 0; i < s.length(); i += period) {
            result.append(s.charAt(i));
        }

        for (int level = 1; level < numRows - 1; level++) {
            for (int i = 0; i < s.length(); i += period) {

                int first = i + level;
                addIfExists(first, s, result);

                int second = i + period - level;
                addIfExists(second, s, result);
            }
        }

        for (int i = 0; i < s.length(); i += period) {
            int lastLayerIndex = i + period / 2;
            addIfExists(lastLayerIndex, s, result);
        }

        return result.toString();
    }

    private void addIfExists(int i, String source, StringBuilder destination) {
        if (i < source.length()) {
            destination.append(source.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 3));
    }
}
