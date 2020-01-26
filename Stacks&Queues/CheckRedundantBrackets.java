import java.util.Stack;

public class solution 
{	
	public static boolean checkRedundantBrackets(String input) 
    {
        Stack<Character> st =new Stack<Character>();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char z=input.charAt(i);
            if(z==')')
            {
                while(st.peek()!='(')
                {
                    st.pop();
                    count++;
                }
                if(count==0)
                    return true;
                st.pop();
                count=0;
            }
            else
            {
                st.push(z);
            }
        }
        return false;
	}
}