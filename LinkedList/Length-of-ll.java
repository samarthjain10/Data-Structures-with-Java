public class Solution 
{
	public static int length(LinkedListNode<Integer> head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
		return count;
	}
}