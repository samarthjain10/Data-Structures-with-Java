import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        r(s1,s2);
	}
    public static void r(Stack<Integer> s1, Stack<Integer> s2) {
        if(s2.isEmpty()==true)
        {
            return ;
        }
        int a=s2.pop();
        r(s1,s2);
        s1.push(a);
    }
}