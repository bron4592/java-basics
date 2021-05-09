package com.company.leetcode;

public class numberOfIslands {
    private static int dfs(int i, int j, int n, int m, String[][] grid) {
        if (i >= n || i < 0 || j >= m || j < 0 || !grid[j][i].equals("1")) {
            return 0;
        }
        grid[j][i] = "0";
        dfs(i + 1, j, n, m, grid);
        dfs(i - 1, j, n, m, grid);
        dfs(i, j + 1, n, m, grid);
        dfs(i, j - 1, n, m, grid);
        return 1;
    }

    public static int countNumberOfIslands(String[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        int count = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                count += dfs(i, j, n, m, grid);
            }
        }
        return count;
    }
    }

