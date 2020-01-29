import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) 
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<input.length;i++)
        {
            pq.add(input[i]);
        }
		while(pq.size()!=k)
        {
            pq.remove();
        }
        while(pq.size()!=0)
        {
            al.add(pq.remove());
        }
        return al;
	}
}