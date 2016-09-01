package solutions;

public class MinStack {
    private static final int INITIAL_CAPACITY = 16;

    private int[] stack;
    private int[] minElements;
    private int size = 0;

    public MinStack() {
        stack = new int[INITIAL_CAPACITY];
        minElements = new int[INITIAL_CAPACITY];
        minElements[0] = Integer.MAX_VALUE;
    }

    public void push(int x) {
        ensureCapacityForPlusOneElement();
        stack[size] = x;
        minElements[size] = size == 0 ? x : Math.min(x, minElements[size - 1]);
        size++;
    }

    private void ensureCapacityForPlusOneElement() {
        if (stack.length == size) {
            stack = doubleArrayLength(stack);
            minElements = doubleArrayLength(minElements);
        }
    }

    private int[] doubleArrayLength(int[] array) {
        int[] result = new int[array.length * 2];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return stack[size - 1];
    }

    public int getMin() {
        if (size == 0) return Integer.MAX_VALUE;
        return minElements[size - 1];
    }
}
