import java.util.HashMap;
public class Solution 
{
	public static int maxFrequencyNumber(int[] arr)
    {
		HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                int a=hs.get(arr[i]);
                hs.put(arr[i],++a);
            }
            else
            {
                hs.put(arr[i],1);
            }
        }
        int k=1;int q=arr[0];
        for(int z:hs.keySet())
        {
            if(hs.get(z)>k)
            {
                k=hs.get(z);
                q=z;
            }
        }
        return q;
	}
}