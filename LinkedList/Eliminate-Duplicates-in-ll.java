public class Solution 
{
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> start=head;
        while(head.next!=null)
        {
            if(head.data.equals(head.next.data))
            {
                head.next=head.next.next;
            }
            else
                head=head.next;
        }
        return start;
    }
}