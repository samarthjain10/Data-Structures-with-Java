import java.util.*;
public class Solution 
{
	public static boolean checkBalanced(String exp)
    {
		Stack<Character> st=new Stack<Character>();
        for(int i=0;i<exp.length();i++)
        {
            char a=exp.charAt(i);
            if(a=='('||a=='{'||a=='[')
            {
                st.push(a);
            }
            else if(a==')')
            {
                if(st.isEmpty()==true)
                {
                    return false;
                }
                else if(st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(a=='}')
            {
                if(st.isEmpty()==true)
                {
                    return false;
                }
                if(st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(a==']')
            {
                if(st.isEmpty()==true)
                {
                    return false;
                }
                if(st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.isEmpty()==true)
        {
            return true;
        }
        return false;
	}
}