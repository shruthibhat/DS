import java.util.Stack;

public class BalancedParanthesis {
	
	public static void main(String[] args)
	{
	 char[] exp1 = {'{','(',')','}','[',']'};
	 char[] exp2 = {'{','(','}',')'};
	 
	 System.out.println("Is exp1 balanced? :"+areParanthesisBalanced(exp1));
	 System.out.println("Is exp2 balanced? :"+areParanthesisBalanced(exp2));
		
	}
	
	
	public static boolean areParanthesisBalanced(char[] exp) {
		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < exp.length; i++) {

			if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
				s.push(exp[i]);

			if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {

				if (s.isEmpty())
					return false;

				else if (!isMatchingPair(s.pop(), exp[i]))
					return false;

			}

		}
		
		if(s.isEmpty())
			return true;
		else
			return false;

	}


	private static boolean isMatchingPair(char c1, char c2) {
		
		if( c1 =='{' && c2 =='}')
			return true;
		else if( c1 =='(' && c2 ==')')
			return true;
		else if( c1 =='[' && c2 ==']')
			return true;
		else		
			return false;
	}

}
