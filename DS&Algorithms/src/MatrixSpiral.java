
public class MatrixSpiral {
public static void main(String[] args) {
	int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
			{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
	spiralMat(a);
}

private static void spiralMat(int[][] m) {
	int left = 0; 
	int right = m[0].length-1;
	int top = 0 ;
	int bottom =  m.length-1;
	int dir = 0;
	while (left <= right && top <= bottom)
	{
		if(dir == 0) {
			for(int i=left;i<=right;i++) {
				System.out.print(" "+m[top][i]);
			}
			top++;
		}
		else if(dir == 1) {
			for(int i=top;i<=bottom;i++) {
				System.out.print(" "+m[i][right]);			
			}
			right--;
		}
		else if(dir == 2) {
			for(int i=right;i>=left;i--) {
				System.out.print(" "+m[bottom][i]);				
			}
			bottom--;
		}
		else if(dir == 3) {
			for(int i=bottom;i>top;i--) {
				System.out.print(" "+m[i][left]);				
			}
			left++;
		}
		dir =(dir + 1) % 4;
	}
	
}
}
