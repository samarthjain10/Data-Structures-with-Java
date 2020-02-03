public class Solution {
    public static long mod = 1000000007 ;
	public static long balancedTreesOfHeightH(int height){
		if(height == 0 || height == 1)
            return 1;
        long x = balancedTreesOfHeightH(height - 1);
        long y = balancedTreesOfHeightH(height - 2);
        return (x*x + 2*x*y)%mod;

	}
}