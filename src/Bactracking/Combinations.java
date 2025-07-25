package Bactracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String args[]) {
        int[] a = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        combinations(result, new ArrayList<>(), 0, 2, a);
        System.out.println(result);
    }

    private static void combinations(List<List<Integer>> result, List<Integer> current, int start, int r, int[] a) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int j = start; j < a.length; j++) {
            System.out.println(j);
            current.add(a[j]);                 // Add actual value, not index
            combinations(result, current, j + 1, r, a); // Move to next index
            current.remove(current.size() - 1);         // Remove last added element
        }
    }
}
