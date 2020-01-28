import java.util.HashMap;
public class solution 
{
	public static String uniqueChar(String str)
    {
		// Write your code here
        HashMap<Character,Integer> hs=new HashMap<>();
        String s="";
        for(int i=0;i<str.length();i++)
        {
            if(!hs.containsKey(str.charAt(i)))
            {
                hs.put(str.charAt(i),1);
                s+=str.charAt(i);
            }
        }
        return s;
	}
}
