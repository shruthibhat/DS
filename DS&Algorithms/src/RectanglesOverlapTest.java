import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectanglesOverlapTest {
	
	RectanglesOverlap rectanglesOverlap;
	Point x1,y1,x2,y2;
	
	@Before
	public void setup() throws Exception
	{
		rectanglesOverlap= new RectanglesOverlap();
		x1 = new Point(0, 10);
		y1 = new Point(10, 0);
		x2 = new Point(5, 5);
		y2 = new Point(15, 0);		
	}

	@Test
	public void shouldReturnTrue() {
		Assert.assertTrue(rectanglesOverlap.doOverlap(x1, y1, x2, y2));			
	}
	
}
