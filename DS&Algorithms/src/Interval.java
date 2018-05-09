
public class Interval {
	
	int left;
	int right;
	
	public Interval(int l, int r) {
		left = l;
		right = r;
	}

	@Override
	public String toString() {
		return "(" + left + "," + right + ")";
	}
	
	

}
