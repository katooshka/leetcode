package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return Collections.singletonList(1);

        List<Integer> previous = Arrays.asList(1, 1);
        if (rowIndex == 1) return previous;

        for (int i = 0; i < rowIndex - 1; i++) {
            previous = generateRow(previous);
        }
        return previous;
    }

    private List<Integer> generateRow(List<Integer> previous) {
        List<Integer> current = new ArrayList<>();
        current.add(1);
        for (int j = 0; j < previous.size() - 1; j++) {
            current.add(previous.get(j) + previous.get(j + 1));
        }
        current.add(1);
        return current;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangle2().getRow(3));
    }
}
