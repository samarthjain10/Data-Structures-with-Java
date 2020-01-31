import java.util.*;
public class Solution 
{
	public static void runningMedian(int arr[]) 
    {
		PriorityQueue<Integer> pqmin = new PriorityQueue<>();
        PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            if(pqmax.isEmpty())
                pqmax.add(arr[0]);
            else if(arr[i]>pqmax.peek())
            {
                pqmin.add(arr[i]);
            }
            else
            {
                pqmax.add(arr[i]);
            }
            if(pqmax.size()-pqmin.size()>1)
            {
                pqmin.add(pqmax.remove());
            }
            else if(pqmin.size()-pqmax.size()>1) 
            {
                pqmax.add(pqmin.remove());
            }
            if(pqmin.size()==pqmax.size())
            {
                System.out.println((pqmin.peek()+pqmax.peek())/2);
            }
            else if(pqmin.size()>pqmax.size())
            {
                System.out.println(pqmin.peek());
            }
            else if(pqmin.size()<pqmax.size())
            {
                System.out.println(pqmax.peek());
            }
        }
	}
}