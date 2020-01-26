import java.util.Stack;
public class Solution
{
	public static int countBracketReversals(String input)
    {		
	    if(input.length()%2==1)
            return -1;
        int count=0;
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{')
                st.push('{');
            else
            {
                if(st.isEmpty())
                {
                    count++;
                    st.push('{');
                } 
                else
                {
                    st.pop();
                }
            }
        }
        return count+st.size()/2;
	}
}