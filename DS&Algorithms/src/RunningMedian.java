import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * 
 * 
 * @author shruthi
 * 
 * 
 * Running Median
 * 
 *  Time - O(log n)
 *
 */
public class RunningMedian {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 0, 3, 5, 2, 0, 1);
		System.out.println("Running median is : " + runningMedian(nums.iterator()));
	}
	
	public static List<Double> runningMedian(Iterator<Integer> sequence) {
		//stores the larger half of the values in the stream
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		//stores the smaller half of the values in the stream
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		
		List<Double> result = new ArrayList<>();
		
		
		while (sequence.hasNext()) {
			int x = sequence.next();
			minHeap.add(x);
			maxHeap.add(minHeap.remove());
			
			if(maxHeap.size() > minHeap.size()) {
				minHeap.add(maxHeap.remove());
			}
			
			result.add(minHeap.size() == maxHeap.size()?0.5 * (minHeap.peek() + maxHeap.peek()):(double)minHeap.peek());
		}
		
		return result;
	}


}
