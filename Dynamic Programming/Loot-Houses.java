public class Solution 
{
	public static int getMaxMoney(int arr[], int n)
    {
        int[] dp= new int[n];
        dp[0]=arr[0];
        if(n>1)
            dp[1]=Math.max(arr[1],dp[0]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[n-1];
	}
}