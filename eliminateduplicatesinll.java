

/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */

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