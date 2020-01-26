class StackEmptyException extends Exception
{
        
}
class StackFullException extends Exception
{
        
}
public class Stack<T> 
{
	private Node<T> head;
    private int size;
    
	public Stack() 
    {
        head=null;
        size=0;
	}
	
	public int size() 
    {
        return size;
	}
	
	public void push(T data) 
    {
        Node<T> n = new Node<T>(data);
        if(head==null)
            head=n;
        else
        {
            n.next=head;
            head=n;
        }
        size++;
	}
	
	public boolean isEmpty() 
    {
        return size()==0;
	}
	
	public T pop() throws StackEmptyException 
    {
        if(isEmpty())
        {
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
	}
	
	public T top() throws StackEmptyException 
    {
    if(isEmpty())
        {
        StackEmptyException e=new StackEmptyException();
        throw e;
    }
    return head.data;
	}
}