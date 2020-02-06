import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();
        int edge[][]=new int[v][v];
        for(int i=0;i<e;i++)
        {
            int sv=s.nextInt();
            int ev=s.nextInt();
            edge[sv][ev]=1;
            edge[ev][sv]=1;
        }
        int si=s.nextInt();
        int ei=s.nextInt();
        boolean visited[]=new boolean[edge.length];
        printHelper(edge,si,ei,visited);
    }
    public static void printHelper(int[][] edge,int sv,int ev,boolean[] visited) 
    {
        LinkedList<Integer> q= new LinkedList<Integer>(); 
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
        visited[sv]=true;
        q.add(sv);
        String path="";
        boolean flag=false;
        while(!q.isEmpty())
        {
            int a=0;
            try{
                a=q.removeFirst();
            }
            catch(Exception e){}
            if(a==ev)
            {
                flag=true;
                break;
            }
            for(int i=0;i<edge.length;i++)
            {
                if(edge[a][i]==1&&visited[i]==false)
                {
                    visited[i]=true;
                    q.add(i);
                    hs.put(i,a);
                }
            }
        }
        if(flag)
        {
            int i=ev;
            while(i!=sv)
            {
                System.out.print(i+" ");
                i=hs.get(i);
            }
            System.out.print(i+" ");
        }
    }
}