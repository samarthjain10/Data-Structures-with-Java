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
        int si = s.nextInt();
        int ei = s.nextInt();
        System.out.print(print(edge,si,ei));
    }
    public static boolean print(int[][] edge,int si,int ei) 
    {
        boolean visited[]=new boolean[edge.length];
        printHelper(edge,si,visited);
        if(visited[ei])
            return true;
        return false;
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