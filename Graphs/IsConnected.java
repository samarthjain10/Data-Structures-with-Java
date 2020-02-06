import java.util.*;

public class Solution {

	public static void main(String[] args) {
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
        System.out.print(print(edge));
        
	}
    public static boolean print(int[][] edge) 
    {
        boolean visited[]=new boolean[edge.length];
        printHelper(edge,0,visited);
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
                return false;
        }
        return true;
    }
    public static void printHelper(int[][] edge,int sv,boolean[] visited) 
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