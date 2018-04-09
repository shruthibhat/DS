/***
 * 
 * 
 * 
 * @author shruthi
 * 
 * 
 * 
 *         Matrix rotation in clockwise direction
 *
 */
public class MatrixRotationI {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Before rotation: ");
		printMatrix(matrix,3);
		rotate(matrix,3);
		System.out.println("After rotation: ");
		printMatrix(matrix,3);

	}

	public static void rotate(int[][] m, int n) {

		for (int layer = 0; layer < n / 2; layer++) {
			int first = 0;
			int last = n - layer - 1;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				// save top
				int top = m[offset][i];

				// left->top
				m[offset][i] = m[last - offset][first];

				// bottom->left
				m[last - offset][first] = m[last][last - offset];

				// right->bottom
				m[last][last - offset] = m[i][last];

				// top->right
				m[i][last] = top;
			}

		}

	}
	
	public static void printMatrix(int[][] m, int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
