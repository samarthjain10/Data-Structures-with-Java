public class solution 
{
    public static int[]dp=new int[2000000];
    public static int max(int a,int b)
    {
        if(a<b)
            return b;
        else return a;
    }
	public  String solve(int n,int x,int y)
    {	
	    dp[1]=1;
        dp[x]=1;
        dp[y]=1;
        for(int i=2;i<=n;i++)
        {
            if(dp[i]==0)
            {
                dp[i]=dp[i-1]^1;
                if(i-x>=1)
                {
                    dp[i]=max(dp[i],dp[i-x]^1);
                }
                if(i-y>=1)
                {
                    dp[i]=max(dp[i],dp[i-y]^1);
                }
            }
        }
        String sol;
        if(dp[n]!=0)
            sol="Beerus";
        else
            sol="Whis";
        return sol;
	}
}