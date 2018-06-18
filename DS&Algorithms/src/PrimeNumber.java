/**
 * 
 * 
 * @author shruthi
 * 
 *         Check if a number is prime
 * 
 *         Solution : you really only have to go up to the square root of n,
 *         because if you list out all of the factors of a number, the square
 *         root will always be in the middle (if it happens to not be an
 *         integer, we're still ok, we just might over-approximate, but our code
 *         will still work).
 * 
 *         Finally, we know 2 is the "oddest" prime - it happens to be the only
 *         even prime number. Because of this, we need only check 2 separately,
 *         then traverse odd numbers up to the square root of n. In the end, our
 *         code will resemble this:
 *
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Is 99 prime number? : "+ isPrime(99));
		System.out.println("Is 133 prime number? : "+ isPrime(133));
		System.out.println("Is 4 prime number? : "+ isPrime(4));
		System.out.println("Is 2 prime number? : "+ isPrime(2));
	}

	private static boolean isPrime(int num) {
		if(num != 2 && num%2 == 0) {
			return false;
		}
		
		for(int i=3;i*i<=num;i+=2) {
			if(num%i ==0)
				return false;
		}
	return true;		
	}
}
