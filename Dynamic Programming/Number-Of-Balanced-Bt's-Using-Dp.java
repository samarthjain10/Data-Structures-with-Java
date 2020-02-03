public class Solution {

    public static int mod = 1000000007;
	public static int balancedTreesOfHeightH(int height){
		if(height == 0 || height == 1)
            return 1;
        int arr[] = new int[height + 1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= height; i++)
        {
            long temp = (long) (arr[i-1]) * arr[i-1];
            temp = temp%mod;
            long temp1 = 2*(long)(arr[i-1]) * arr[i-2];
            temp1 = temp1%mod;
            arr[i] = (int)(temp + temp1);
        }
        return arr[height];
	}
}