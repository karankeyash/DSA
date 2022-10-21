class Solution {
    public int uniquePaths(int m, int n) {

        // Unique Path I
        int[][] dp = new int[m][n];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }

        return helper (0, 0, m, n, dp);
    }
    static int helper (int i, int j, int m, int n, int[][] dp) {

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (i >= m || j >= n) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }


        int right = helper(i, j + 1, m, n, dp);
        int down  = helper(i + 1, j, m, n, dp);

        dp[i][j] = right + down;
        return right + down;
    }

    // Unique Path II
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        // Unique Path 🛕❤🚩

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        return helper (0, 0, obstacleGrid.length, obstacleGrid[0].length, obstacleGrid, dp);

    }
    static int helper (int i, int j, int m, int n, int[][] grid, int[][] dp) {

        if (i >= m || j >= n || grid[i][j] == 1) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int rigth = helper(i, j + 1, m, n, grid, dp);
        int down  = helper(i + 1, j, m, n, grid, dp);

        dp[i][j] = rigth + down;
        return dp[i][j];

    }
}