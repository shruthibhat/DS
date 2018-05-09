import java.util.ArrayList;
import java.util.List;

/***
 * 
 * 
 * @author shruthi
 * 
 * 
 *         Write a program which takes an input an array of disjoined intervals
 *         with integer endpoints, sorted by the increasing order of the left
 *         endpoints and an interval to be added, and returns the union of
 *         intervals in the array and the added interval. The result should be
 *         expresses as a union of disjoint intervals sorted by left endpoints
 * 
 *         eg: (-4,-1),(0,2),(3,6),(7,9),(11,12),(14,17) input - (1,8)
 * 
 *         output: (-4,-1),(0,9),(11,12),(14,17)
 * 
 *         time -0(n) space -O(1)
 *
 */
public class MergingIntervals {

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(-4, -1));
		list.add(new Interval(0, 2));
		list.add(new Interval(3, 6));
		list.add(new Interval(7, 9));
		list.add(new Interval(11, 12));
		list.add(new Interval(14, 17));

		List<Interval> o = mergeIntervals(list, new Interval(1, 8));

		System.out.println(o);
	}

	public static List<Interval> mergeIntervals(List<Interval> list, Interval p) {

		int i = 0;

		List<Interval> result = new ArrayList<>();

		while (i < list.size() && p.left > list.get(i).right) {
			result.add(list.get(i++));
		}

		while (i < list.size() && p.right >= list.get(i).left) {
			p = new Interval((Math.min(list.get(i).left, p.left)), Math.max(list.get(i).right, p.right));
			i++;
		}

		result.add(p);
		result.addAll(list.subList(i, list.size()));

		return result;
	}

}
