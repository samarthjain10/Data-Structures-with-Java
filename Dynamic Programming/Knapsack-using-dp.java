
public class Solution {
	
	
	
	public static int knapsack(int[] weight,int value[],int maxWeight){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
		int sp[] = new int[maxWeight+1];
        int sc[]=new int[maxWeight+1];
        for(int i=1;i<value.length+1;i++)
        {
            for(int w=1;w<maxWeight+1;w++)
            {
                if(weight[i-1]>w)
                {
                    sc[w]=sp[w];
                }
                else
                {
                    sc[w]=Math.max(sp[w-weight[i-1]]+value[i-1],sp[w]);
                }
            }
            sp=sc;
            sc=new int[maxWeight+1];
        }
        return sp[maxWeight];
	}
	
}
