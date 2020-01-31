import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        int l=input.size();
        for(int i=0;i<l;i++)
        {
        	int m=input.get(i).size();
            for(int j=0;j<m;j++)
            {
                int k=input.get(i).get(j);
                pq.add(k);
            }
        }
		ArrayList<Integer> al=new ArrayList<Integer>();
        int o=pq.size();
        for(int i=0;i<o;i++)
        {
            al.add(pq.remove());
        }
        return al;
	}

}