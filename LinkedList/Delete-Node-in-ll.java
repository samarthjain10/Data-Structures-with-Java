public class Solution 
{
	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i)
    {
        int count=0;
        LinkedListNode<Integer> ptr=head,prev=null;
        while(ptr.next!=null&&count!=i)
        {
            count++;
            prev=ptr;
            ptr=ptr.next;
        }
        if(head==ptr)
        {
            head=ptr.next;
            ptr.next=null;
            ptr=null;
        }
        else if(count==i)
        {
            prev.next=ptr.next;
            ptr.next=null;
            ptr=null;
        }
        return head;
	}
}