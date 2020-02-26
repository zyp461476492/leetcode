class Solution {
    int m, n, k;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0, 0);
    }

    private int dfs(int i, int j) {
        if (!check(i, j))
            return 0;
        this.visited[i][j] = true;
        return 1 + dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j - 1) + dfs(i, j + 1);
    }

    private boolean check(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || sum(i, j) > k || visited[i][j])
            return false;
        return true;
    }

    private int sum(int i, int j) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        while (j > 0) {
            sum += j % 10;
            j = j / 10;
        }
        return sum;
    }
}