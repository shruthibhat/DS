import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedArraysTest {
	
	MergeTwoSortedArrays mergeTwoSortedArrays;
	int[] a;
	int[] b;
	
	@Before
	public void setup() throws Exception
	{
		mergeTwoSortedArrays= new MergeTwoSortedArrays();
		a = new int[] {2,4,6,8,10};
		b = new int[] {1,3,5,7,9 };
	}

	
	@Test
	public void shouldReturnMergedArray() {
		
		Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10},mergeTwoSortedArrays.mergeArrays(a, b));
			
	}
}
