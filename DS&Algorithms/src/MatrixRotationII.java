/***
 * 
 * 
 * @author shruthi
 * 
 *         Matrix rotation in anti-clockwise direction
 *
 * 
 */
public class MatrixRotationII {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Before rotation: ");
		printMatrix(matrix, 3);
		rotate(matrix, 3);
		System.out.println("After rotation: ");
		printMatrix(matrix, 3);

	}

	public static void rotate(int[][] m, int n) {
		
		for(int i =0;i < n/2; i++) {
			for (int j = 0;j < n-i-1; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][n-1-i];
				m[j][n-1-i] = m[n-1-i][n-1-j];
				m[n-1-i][n-1-j] = m[n-1-j][i];
				m[n-1-j][i] = temp;			
			}
		}

	}

	public static void printMatrix(int[][] m, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
