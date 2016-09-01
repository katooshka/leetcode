package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        for (int i = 1; i < numRows; i++) {
            result.add(generateRow(result.get(i - 1)));
        }
        return result;
    }

    private List<Integer> generateRow(List<Integer> previousRow) {
        List<Integer> current = new ArrayList<>();
        current.add(1);
        for (int i = 1; i < previousRow.size(); i++) {
            current.add(previousRow.get(i - 1) + previousRow.get(i));
        }
        current.add(1);
        return current;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(3));
    }
}
