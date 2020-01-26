import java.util.Stack;

public class Solution 
{
	public static int[] stockSpan(int[] price)
    {
		Stack<Integer> st=new Stack<Integer>();
        st.push(0);
        int arr[]=new int[price.length];
        arr[0]=1;
        for(int i=1;i<price.length;i++)
        {
            while(!st.isEmpty()&&price[st.peek()]<price[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr[i]=i+1;
            }
            else
            {
                arr[i]=i-st.peek();
            }
            st.push(i);
        }
        return arr;
	}
}mm