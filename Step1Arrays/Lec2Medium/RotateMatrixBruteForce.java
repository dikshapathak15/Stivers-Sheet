package Step1Arrays.Lec2Medium;

public class RotateMatrixBruteForce {
    public static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        // Place elements in rotated positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    // Utility to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] rotated = rotate90(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printMatrix(rotated);
    }
}
