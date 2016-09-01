package solutions;

public class AddDigits {
     public int addDigits(int num) {
         int result = num;
         while (result >= 10) {
             result = getSum(result);
         }
         return result;
     }

     private int getSum(int num) {
         int result = 0;
         while (num > 0) {
             result += num % 10;
             num /= 10;
         }
         return result;
     }
}
