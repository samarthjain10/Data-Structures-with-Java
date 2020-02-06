import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int edges[][]=new int[v][v];
		for(int i=0;i<e;i++)
		{
			int sv=s.nextInt();
			int ev=s.nextInt();
			edges[sv][ev]=1;
			edges[ev][sv]=1;
		}
        int si=s.nextInt();
		int ei=s.nextInt();
		System.out.print(print(edges,si,ei));
    }
    public static String printHelper(int edges[][],int sv,int ev,boolean visited[],String output)
    {
        visited[sv]=true;
        for(int j=0;j<edges.length;j++)
        {
            if(edges[sv][j]==1 && !visited[j])
            {
                visited[j]=true;
                if(j==ev)
                    return ev+" ";
                output=printHelper(edges,j,ev,visited,output);
                if(!output.equals(""))
                    return output+j+" ";
                
            }
        }
        return output;
    }
    public static String print(int edges[][],int si,int ei)
    {
        boolean visited[]=new boolean[edges.length];
        String output=printHelper(edges,si,ei,visited,"");
        if(!output.equals(""))
            return output+si+" ";
        return output;
    }
}