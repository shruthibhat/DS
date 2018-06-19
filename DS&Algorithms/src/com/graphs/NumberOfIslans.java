package com.graphs;

/***
 * 
 * 
 * @author shruthi
 *
 *
 *
 *         Given a 2d grid map of '1's (land) and '0's (water), count the number
 *         of islands. An island is surrounded by water and is formed by
 *         connecting adjacent lands horizontally or vertically. You may assume
 *         all four edges of the grid are all surrounded by water.
 * 
 *         Example 1:
 * 
 *         Input: 
 *         11110 
 *         11010 
 *         11000 
 *         00000
 * 
 *         Output: 1
 * 
 *         Example 2:
 * 
 *         Input: 
 *         11000 
 *         11000 
 *         00100 
 *         00011
 * 
 *         Output: 3
 * 
 * 
 *         Time complexity : O(M \times N)O(M×N) where MM is the number of rows
 *         and NN is the number of columns.
 * 
 *         Space complexity : worst case O(M \times N)O(M×N) in case that the
 *         grid map is filled with lands where DFS goes by M \times NM×N deep.
 * 
 * 
 */
public class NumberOfIslans {

	public static void main(String[] args) {
		char[][] m1 = { 
				{ '1', '1', '1', '1', '0' }, 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		char[][] m2 = { 
				{ '1', '1', '0', '0', '0' }, 
				{ '1', '1', '0', '0', '0' }, 
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println("The number of islands for m1 is :" + numIslands(m1));
		System.out.println("The number of islands for m2 is :" + numIslands(m2));
	}

	public static int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int nr = grid.length;
		int nc = grid[0].length;
		int num_islands = 0;

		for (int i = 0; i < nr; i++) {
			for (int j = 0; j < nc; j++) {
				if (grid[i][j] == '1') {
					num_islands++;
					dfs(grid, i, j);
				}
			}
		}

		return num_islands;
	}

	private static void dfs(char[][] grid, int i, int j) {
		int nr = grid.length;
		int nc = grid[0].length;

		if (i < 0 || j < 0 || i >= nr || j >= nc || grid[i][j] == '0') {
			return;
		}

		grid[i][j] = '0';
		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);
	}

}


/*
BFS CAN BE USED AS WELL


class Solution {
public int numIslands(char[][] grid) {
  if (grid == null || grid.length == 0) {
    return 0;
  }

  int nr = grid.length;
  int nc = grid[0].length;
  int num_islands = 0;

  for (int r = 0; r < nr; ++r) {
    for (int c = 0; c < nc; ++c) {
      if (grid[r][c] == '1') {
        ++num_islands;
        grid[r][c] = '0'; // mark as visited
        Queue<Integer> neighbors = new LinkedList<>();
        neighbors.add(r * nc + c);
        while (!neighbors.isEmpty()) {
          int id = neighbors.remove();
          int row = id / nc;
          int col = id % nc;
          if (row - 1 >= 0 && grid[row-1][col] == '1') {
            neighbors.add((row-1) * nc + col);
            grid[row-1][col] = '0';
          }
          if (row + 1 < nr && grid[row+1][col] == '1') {
            neighbors.add((row+1) * nc + col);
            grid[row+1][col] = '0';
          }
          if (col - 1 >= 0 && grid[row][col-1] == '1') {
            neighbors.add(row * nc + col-1);
            grid[row][col-1] = '0';
          }
          if (col + 1 < nc && grid[row][col+1] == '1') {
            neighbors.add(row * nc + col+1);
            grid[row][col+1] = '0';
          }
        }
      }
    }
  }

  return num_islands;
}
}

Time complexity : O(M \times N)O(M×N) where MM is the number of rows and NN is the number of columns.

Space complexity : O(min(M, N))O(min(M,N)) because in worst case where the grid is filled with lands, the size of queue can grow up to min(M,NM,N).

*/