/**
 * Solved by Paco
 * Date: 2022-07-08 17:12:37
 * Exercise number: 695
 * Title: max-area-of-island
 * Proramming Language: Java
 */


package com.paco.algorithms.java.leetcode.editor.en;

public class MaxAreaOfIsland {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private int n1;
        private int n2;

        public int maxAreaOfIsland(int[][] grid) {
            int maxV = 0;
            n1 = grid.length;
            for (int i = 0; i < grid.length; i++) {
                n2 = grid[i].length;
                for (int q = 0; q < grid[i].length; q++) {
                    if (grid[i][q] == 1)
                        maxV = Math.max(maxV, getMaxArea(i, q, grid));
                }
            }
            return maxV;
        }

        private int getMaxArea(int i, int q, int[][] grid) {
            grid[i][q] = 2;
            int a = 0, b = 0, c = 0, d = 0;
            if (i + 1 < n1 && grid[i + 1][q] == 1)
                a = getMaxArea(i + 1, q, grid);
            if (i - 1 >= 0 && grid[i - 1][q] == 1)
                b = getMaxArea(i - 1, q, grid);
            if (q + 1 < n2 && grid[i][q + 1] == 1)
                c = getMaxArea(i, q + 1, grid);
            if (q - 1 >= 0 && grid[i][q - 1] == 1)
                d = getMaxArea(i, q - 1, grid);
            return a + b + c + d + 1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}