import java.util.HashMap;
public class Intersection
{
    public static void intersection(int[] arr1, int[] arr2)
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(hs.containsKey(arr1[i]))
            {
                int a=hs.get(arr1[i]);
                hs.put(arr1[i],++a);
            }
            else
                hs.put(arr1[i],1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(hs.containsKey(arr2[i])&&hs.get(arr2[i])!=0)
            {
                System.out.println(arr2[i]);
                int a=hs.get(arr2[i]);
                hs.put(arr2[i],--a);
            }
        }
	}
}

