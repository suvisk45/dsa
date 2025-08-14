package Arrays;

import java.util.Stack;

public class MaximumRectangleInTheHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }

        System.out.println(maxArea);
    }
}
