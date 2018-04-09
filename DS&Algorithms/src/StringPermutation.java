
public class StringPermutation {
	
	public static void main(String[] args)
    {
        String str1 = "ABC";
        int str1Length = str1.length();
        StringPermutation permutation1 = new StringPermutation();
        permutation1.permutation(str1, 0, str1Length-1);
        
        System.out.println("***************");
        
        String str2 = "CARL";
        int str2Length = str1.length();
        StringPermutation permutation2 = new StringPermutation();
        permutation2.permutation(str2, 0, str2Length-1);
    }
	
	public void permutation(String s, int left, int right)
	{
		if( left == right)
			System.out.println(s);
		else {
			
			for(int i=left;i<=right;i++)
			{
				s = swap(s,left,i);
				permutation(s,left+1,right);
				s= swap(s,left,i);
			}
		}
	}

	private String swap(String s, int i, int j) {
		char temp;
		char[] charArray =s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		s = String.valueOf(charArray);
		return s;
	}

}
