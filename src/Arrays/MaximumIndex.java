package Arrays;

public class MaximumIndex {

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int[] min = new int[arr.length];
        int[] max = new int[arr.length];
        min[0] = arr[0];
        max[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            min[i] = Math.min(min[i - 1], arr[i]);
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            max[i] = Math.max(max[i + 1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(min[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(max[i] + " ");
        }
        int left = 0, right = 0, maxs = -1;
        while (left < arr.length && right < arr.length) {
            if (min[left] <= max[right]) {
                maxs = Math.max(maxs, right - left);
                right++;
            } else {
                left++;
            }
        }
        System.out.println("Max Index Difference: " + maxs);

    }
}
