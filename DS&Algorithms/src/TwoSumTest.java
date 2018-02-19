import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {
	
	TwoSum t;
	int target;
	
	@BeforeEach
	public void setUp() throws Exception {
		t = new TwoSum();
		target = 10;
	      
	}
	 
	@Test
	public void testShouldReturnZeroesForNull()
	{
		int[] d= {};
		Assert.assertArrayEquals(new int[] {0, 0},t.twoSum(d, target));
	}
	
	@Test
	public void testShouldReturnNonZeroResult()
	{
		int[] a= { 20, 2, 5, 8, 1 };	
		Assert.assertArrayEquals(new int[] {2, 4},t.twoSum(a, target));
	}
	
	@Test
	public void testShouldReturnZeroResult()
	{
		int[] b= { 2, 1, 5, 21, 20 };
		Assert.assertArrayEquals(new int[] {0, 0},t.twoSum(b, target));
	}
	
	@Test
	public void testShouldReturnTwoIndexes()
	{
		int[] c= { 2, 2, 5, 8, 1 };
		Assert.assertArrayEquals(new int[] {2, 4},t.twoSum(c, target));	
	}
	
	
}
