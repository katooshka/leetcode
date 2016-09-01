package solutions;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int d = n % 26;
            if (d == 0) {
                sb.append('Z');
                n = n / 26 - 1;
            } else {
                char letter = (char) (n % 26 - 1 + 'A');
                sb.append(letter);
                n = n / 26;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
    }
}
