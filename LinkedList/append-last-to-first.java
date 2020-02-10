public class Solution 
{
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) 
    {
        int length=0;
        LinkedListNode<Integer> start=root;
        LinkedListNode<Integer> last=null;
        while(root!=null)
        {
            length++;
            last=root;
            root=root.next;
        }
        int value=(length-1)-n;
        int count=0;
        LinkedListNode<Integer> ptr=start;;
        while(ptr!=null&&count!=value)
        {
            count++;
            ptr=ptr.next;
        }
        last.next=start;
        start=ptr.next;
        ptr.next=null;
        return start;
    }
}
