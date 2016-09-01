package solutions;

import java.util.ArrayList;
import java.util.List;

public class ImplementQueueUsingStacks {

    private final List<Integer> mainStack = new ArrayList<>();
    private final List<Integer> auxiliaryStack = new ArrayList<>();

    public void push(int x) {
        if (mainStack.isEmpty()) {
            mainStack.add(x);
        } else {
            while (!mainStack.isEmpty()){
                int current = mainStack.remove(mainStack.size() - 1);
                auxiliaryStack.add(current);
            }
            mainStack.add(x);
            while (!auxiliaryStack.isEmpty()) {
                int current = auxiliaryStack.remove(auxiliaryStack.size() - 1);
                mainStack.add(current);
            }
        }
    }

    public void pop() {
        mainStack.remove(mainStack.size() - 1);
    }

    public int peek() {
        return mainStack.get(mainStack.size() - 1);
    }

    public boolean empty() {
        return mainStack.isEmpty();
    }
}
