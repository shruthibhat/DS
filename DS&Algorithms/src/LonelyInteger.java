
public class LonelyInteger {
	public static void main(String[] args)
	{
		int[] a = {1,1,2,3,4,2,3,5,5};
		int value = findLonelyInteger(a);
		System.out.println("Lonely Integer is :"+ value);
	}

	public static int findLonelyInteger(int[] a)
	{
		int value = 0;

	    for (int i : a) {
	        value ^= i;
	    }
	    return value;
		
	}
}
