package solutions;

public class PalindromeNumber {
    public boolean isPalindrome(int number) {
        if (number == 0) return true;
        if (number < 0) return false;

        int numberCopy = number;
        int result = 0;
        while (number != 0) {
            if (result > Integer.MAX_VALUE / 10) {
                return false;
            }
            result = result * 10 + number % 10;
            number = number / 10;
        }

        return result == numberCopy;
    }
}
