/*
 * @lc app=leetcode.cn id=289 lang=java
 *
 * [289] 生命游戏
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                core(i, j, board);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == -1)
                    board[i][j] = 1;
                if (board[i][j] == 2)
                    board[i][j] = 0;
            }
        }
    }

    public void core(int i, int j, int[][] board) {
        int count = 0;
        int xBorder = board.length;
        int yBorder = board[i].length;
        for (int p = i - 1; p <= i + 1; p++) {
            for (int q = j - 1; q <= j + 1; q++) {
                if (p == i && q == j)
                    continue;
                if (p >= 0 && p < xBorder && q >= 0 && q < yBorder && board[p][q] > 0)
                    count++;
            }
        }

        if (board[i][j] > 0) {
            if (count < 2 || count > 3) {
                board[i][j] = 2;
            }
        }
        if (board[i][j] <= 0 && count == 3) {
            board[i][j] = -1;
        }
    }
}
// @lc code=end
