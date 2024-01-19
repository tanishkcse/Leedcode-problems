class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n]; // 2D array for dynamic programming

        // Initialize the first row of dp with the values from the matrix
        for (int col = 0; col < n; col++) {
            dp[0][col] = matrix[0][col];
        }

        // Start the dynamic programming process for the remaining rows
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Calculate the minimum falling path sum for the current cell
                dp[row][col] = matrix[row][col] + Math.min(
                        Math.min(getValue(row - 1, col - 1, n, dp), getValue(row - 1, col, n, dp)),
                        getValue(row - 1, col + 1, n, dp)
                );
            }
        }

        // Find the minimum falling path sum in the last row
        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minSum = Math.min(minSum, dp[n - 1][col]);
        }

        return minSum;
    }

    private int getValue(int row, int col, int n, int[][] dp) {
        // Helper method to safely get values from the dp array
        if (row >= 0 && row < n && col >= 0 && col < n) {
            return dp[row][col];
        }
        return Integer.MAX_VALUE;
    }
}
