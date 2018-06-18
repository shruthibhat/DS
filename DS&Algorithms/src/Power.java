
public class Power {

	public static void main(String[] main) {
		System.out.println(" 5 power 10 is : " + pow(5.0,10));
		System.out.println(" 5 power 3  is : " + pow(5.0,3));
		System.out.println(" 0 power 0  is : " + pow(0.0,0));
		System.out.println("-5 power 2  is : " + pow(-5.0,2));
		System.out.println("-5 power 3  is : " + pow(-5.0,3));
		System.out.println("2 power -2  is : " + pow(2.0,-2));
	}
	
	private static double pow(double x, int n) {
		int N = n;
		if( N < 0) {
			x  = 1/x;
			N =- N;
		}
		
		return fastPow(x,N);
	}
	
	
	private static double fastPow(double x, int n) {
		if(n == 0) { return 1; }

		double result = fastPow(x,n/2);

		if(n%2 == 0) {return result * result;}

		return x * result * result;
	}
}


/*

Iterative approach - log(n) complexity




class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }
};


*/
