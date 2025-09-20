package Step1Arrays.Lec2Medium;

import java.util.*;
public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return ans;

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    // Utility to print the result
    public static void main(String[] args) {
        spiralMatrix sol = new spiralMatrix();
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(sol.spiralOrder(mat));
    }
}
//tc = 0(n^2)
//sc = 0(1)