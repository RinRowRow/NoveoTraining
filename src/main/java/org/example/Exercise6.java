package org.example;

import org.example.domen.TreeNode;

public class Exercise6 {
    /*
Number of Islands

Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
    */

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    floodIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void floodIsland(char[][] grid, int sr, int sc) {
        if (sr >= grid.length || sr < 0 || sc >= grid[sr].length || sc < 0 || grid[sr][sc] == '0') {
            return;
        }
        grid[sr][sc] = '0';
        floodIsland(grid, sr + 1, sc);
        floodIsland(grid, sr - 1, sc);
        floodIsland(grid, sr, sc + 1);
        floodIsland(grid, sr, sc - 1);
    }
}
