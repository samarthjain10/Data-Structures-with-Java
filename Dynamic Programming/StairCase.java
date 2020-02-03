public class Solution 
{
    public static long staircase(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        long ways[]=new long[n+1];
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        for(int i=3;i<=n;i++)
            ways[i]=ways[i-1]+ways[i-2]+ways[i-3];
        return ways[n];
    }
}