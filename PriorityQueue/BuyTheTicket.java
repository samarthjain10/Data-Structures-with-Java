import java.util.*;
public class Solution 
{	
	public static int buyTicket(int input[], int k) 
   {
       int count=0;
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
       LinkedList<Integer> q=new LinkedList<Integer>();
       for(int i=0;i<input.length;i++)
       {
           pq.add(input[i]);
           q.addLast(i);
       }
       while(!q.isEmpty())
       {
    	   int temp=0;
    	   try 
           {
               temp=q.removeFirst();
    	   }
    	   catch(Exception e) {}
           if(input[temp]==pq.peek())
           {
               count++;
               if(temp==k)
                   return count;
               pq.remove();
           }
           else
           {
               q.addLast(temp);
           }
       }
       return 0;
	}
}