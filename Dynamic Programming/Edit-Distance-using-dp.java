public class Solution 
{	
	public static int editDistance(String s1, String s2)
    {
        if(s1.length()==0)
            return s2.length();
        if(s2.length()==0)
            return s1.length();
        int m=s1.length();
        int n=s2.length();
        int[][] storage=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            storage[i][0]=i;
        for(int j=0;j<=n;j++)
            storage[0][j]=j;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(m-i)==s2.charAt(n-j))
                    storage[i][j]=storage[i-1][j-1];
                else
                {
                    int op1=1+storage[i-1][j];
                    int op2=1+storage[i-1][j-1];
                    int op3=1+storage[i][j-1];
                    storage[i][j]=Math.min(op1,Math.min(op2,op3));
                }
            }
        }
        return storage[m][n];
	}	
}