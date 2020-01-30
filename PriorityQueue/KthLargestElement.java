import java.util.Collections;
import java.util.PriorityQueue;
public class Solution {

	public static int kthLargest(int arr[], int k) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        k--;
        while(k!=0)
        {
            pq.remove();
            k--;
        }
        return pq.peek();
	}
}
