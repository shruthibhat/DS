import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {
	
	TwoSum t;
	int target;
	int[] a= { 20, 2, 5, 8, 1 };	
	int[] b= { 2, 1, 5, 21, 20 };
	int[] c= { 2, 2, 5, 8, 1 };
	
	@BeforeEach
	public void setUp() throws Exception {
		t = new TwoSum();
		target = 10;
	      
	}
	    
	@Test
	public void testShouldReturnNonZeroResult()
	{
		
		Assert.assertArrayEquals(new int[] {2, 4},t.twoSum(a, target));
	}
	
	@Test
	public void testShouldReturnZeroResult()
	{
	
		Assert.assertArrayEquals(new int[] {0, 0},t.twoSum(b, target));
	}
	
	@Test
	public void testShouldReturnTwoIndexes()
	{
		
		Assert.assertArrayEquals(new int[] {2, 4},t.twoSum(c, target));	
	}
	
	
}
