class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, wordArr, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    /**
    * dfs bootm top left right
    */
    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        // index out of range
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || words[k] != board[i][j])
            return false;
        if (k == words.length - 1)
            return true;
        char temp = board[i][j];
        // visited flag
        board[i][j] = '/';
        boolean res = dfs(board, words, i + 1, j, k + 1) || dfs(board, words, i - 1, j, k + 1) || 
                dfs(board, words, i, j - 1, k + 1) || dfs(board, words, i, j + 1, k + 1);
        // reset flag
        board[i][j] = temp;
        return res;
    }
}