
/*
Find if two rectangles overlap
*/

/*
 * Time complexity - O(1)
 */

public class RectanglesOverlap {
	
	public boolean doOverlap(Point r1Left, Point r1Right, Point r2Left, Point r2Right)
	{
		// check for x co-ordinates
		if((r1Left.getP1( ) > r1Right.getP1()) || (r2Left.getP1() > r2Right.getP1()))
			return false;
		
		// check for y co-ordinates
		if((r1Left.getP2() < r1Right.getP2()) || (r2Left.getP2() < r2Right.getP2()))
			return false;		
		
		return true;		
	}
	
	

}
