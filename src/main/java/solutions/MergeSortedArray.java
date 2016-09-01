package solutions;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] main, int m, int[] secondary, int n) {
        int mainIndex = m - 1;
        int secondaryIndex = n - 1;
        for (int destinationIndex = n + m - 1; destinationIndex >= 0; destinationIndex--) {
            if (mainIndex == -1 || (secondaryIndex != -1 && secondary[secondaryIndex] > main[mainIndex])) {
                main[destinationIndex] = secondary[secondaryIndex];
                secondaryIndex--;
            } else {
                main[destinationIndex] = main[mainIndex];
                mainIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0};
        new MergeSortedArray().merge(arr, 0, new int[]{1}, 1);
        System.out.println(Arrays.toString(arr));
    }
}
