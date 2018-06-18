import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author shruthi
 * 
 *         Given a collection of intervals, merge all overlapping intervals.
 *         
 *         Input: [[1,3],[2,6],[8,10],[15,18]] 
 *         Output: [[1,6],[8,10],[15,18]]
 *         Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * 
 *         Input: [[1,4],[4,5]] 
 *         Output: [[1,5]] 
 *         Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
 *
 */
public class MergeIntervals {
	
	
	public static void main(String[] args) {
		Interval i1 = new Interval(1,9);
		Interval i2 = new Interval(2,5);
		Interval i3 = new Interval(19,20);
		Interval i4 = new Interval(10,11);
		Interval i5 = new Interval(12,20);
		Interval i6 = new Interval(0,3);
		Interval i7 = new Interval(0,1);
		Interval i8 = new Interval(0,2);
		
		List<Interval> intervalList = new ArrayList<>();
		intervalList.add(i1);
		intervalList.add(i2);
		intervalList.add(i3);
		intervalList.add(i4);
		intervalList.add(i5);
		intervalList.add(i6);
		intervalList.add(i7);
		intervalList.add(i8);
		
		System.out.println("Before sorting the input list");
		intervalList.forEach(l -> System.out.print(" " +l));
		List<Interval> result = mergingInterval(intervalList);
		System.out.println("\nAfter merging");
		System.out.println(result);
	}

	private static List<Interval> mergingInterval(List<Interval> list){
		
		//First sort the list
		list.sort((a,b) -> a.left - b.left);
		System.out.println("\nBefore sorting the input list");
		list.forEach(l -> System.out.print("  " + l));
		
		LinkedList<Interval> result = new LinkedList<>();
		
		for (Interval i: list) {
			if(result.isEmpty() || result.getLast().right < i.left) {
				result.add(i);
			}
			else {
				result.getLast().right = Math.max(result.getLast().right, i.right);
			}
		}
		
		return result;	
	}
}
