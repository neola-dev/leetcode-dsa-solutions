// Problem: Set Matrix Zeroes
// Approach: Use extra arrays to mark rows and columns
// Time Complexity: O(m * n)
// Space Complexity: O(m + n)

class Solution {

    // This method sets the entire row and column to zero
    // if an element in the matrix is zero
    public void setZeroes(int[][] matrix) {

        // Array to mark rows that need to be set to zero
        int[] row = new int[matrix.length];

        // Array to mark columns that need to be set to zero
        int[] col = new int[matrix[0].length];

        // First pass: identify rows and columns containing zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass: set matrix elements to zero
        // based on marked rows and columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
