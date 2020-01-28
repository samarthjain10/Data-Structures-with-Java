import java.util.*;
public class solution 
{
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{
        int sum=0,max=0;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
            if(hs.containsKey(sum))
            {
                if(i-hs.get(sum)>max)
                    max=i-hs.get(sum);
            }
            else
            {
                if(sum==0)
                {
                    if(i+1>max)
                        max=i+1;
                }
                hs.put(sum,i);
            }
        }
		return max;
	}
}