
public class Power {

	public static void main(String[] main) {
		System.out.println(" 5 power 10 is : " + pow(5.0,10));
		System.out.println(" 5 power 3  is : " + pow(5.0,3));
		System.out.println(" 0 power 0  is : " + pow(0.0,0));
		System.out.println("-5 power 2  is : " + pow(-5.0,2));
		System.out.println("-5 power 3  is : " + pow(-5.0,3));
	}
	
	private static double pow(double x, int n) {
		if(n == 0) { return 1; }
		
		double result = pow(x,n/2);
		
		if(n%2 == 0) {return result * result;}
		
		return x * result * result;
	}
}
