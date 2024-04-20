class Solution {
    public void solve(char[][] board) {
        int n = board.length;
      
        int m = board[0].length;

        // Traverse the border
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }
        for (int j = 0; j < m; j++) {
            dfs(board, 0, j);
            dfs(board, n - 1, j);
        }

        // Convert 'O' to 'X' and 'M' back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'M') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        int n = board.length;
        int m = board[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != 'O') return;

        board[i][j] = 'M'; // Mark as visited

        // Explore neighbors
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
