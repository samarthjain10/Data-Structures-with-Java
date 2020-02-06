import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int[][] edge=new int[v][v];
        for(int i=0;i<e;i++)
        {
            int sv=s.nextInt();
            int ev=s.nextInt();
            edge[sv][ev]=1;
            edge[ev][sv]=1;
        }
        boolean visited[]=new boolean[edge.length];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<edge.length;i++)
        {
            if(!visited[i])
            {
                printHelper(edge,i,visited,pq);
            }
            while(!pq.isEmpty())
            {
                System.out.print(pq.remove()+" ");
            }
            System.out.println();
        }
    }
    
    public static void printHelper(int[][] edge,int sv,boolean[] visited,PriorityQueue<Integer> pq) 
    {
        LinkedList<Integer> q= new LinkedList<Integer>(); 
        visited[sv]=true;
        q.add(sv);
        while(!q.isEmpty())
        {
            int a=0;
            try{
                a=q.removeFirst();
            }
            catch(Exception e){}
            pq.add(a);
            for(int i=0;i<edge.length;i++)
            {
                if(edge[a][i]==1&&visited[i]==false)
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    
}