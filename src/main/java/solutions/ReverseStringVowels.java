package solutions;

public class ReverseStringVowels {
    public String reverseVowels(String s) {
        char[] string = s.toCharArray();
        int i, j;
        for (i = 0, j = s.length() - 1; i < j; ) {
            while (i < s.length() && !isVowel(s.charAt(i))){
                i++;
            }
            while (j >= 0 && !isVowel(s.charAt(j))) {
                j--;
            }
            if (i < j) {
                swap(string, i, j);
                i++;
                j--;
            }
        }
        return new String(string);
    }

    private boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'e' ||
                character == 'u' ||
                character == 'i' ||
                character == 'o' ||
                character == 'a' ||
                character == 'E' ||
                character == 'U' ||
                character == 'I' ||
                character == 'O' ||
                character == 'A';
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringVowels().reverseVowels("mutoratine"));
    }
}
