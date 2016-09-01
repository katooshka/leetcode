package solutions;

public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int intersection = computeIntersectionArea(A, C, E, G) * computeIntersectionArea(B, D, F, H);
        int firstArea = (C - A) * (D - B);
        int secondArea = (G - E) * (H - F);
        return firstArea + secondArea - intersection;
    }

    private static int computeIntersectionArea(int firstLeft, int firstRight, int secondLeft, int secondRight) {
        int firstLength = firstRight - firstLeft;
        int secondLength = firstRight - firstLeft;

        if (firstLength == 0 || secondLength == 0 || firstRight < secondLeft || secondRight < firstLeft) {
            return 0;
        }

        if (firstLeft <= secondLeft) {
            if (firstRight <= secondRight) {
                return firstRight - secondLeft;
            } else {
                return secondLength;
            }
        } else {
            if (firstRight <= secondRight) {
                return firstLength;
            } else {
                return secondRight - firstLeft;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
    }

}
