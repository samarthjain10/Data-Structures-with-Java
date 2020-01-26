class QueueEmptyException extends Exception
{
    
}
class QueueFullException extends Exception
{
    
}
public class Queue<T> 
{
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
	public Queue() 
    {
        head=null;
        tail=null;
        size=0;
	}
    
	public void enqueue(T data) 
    {
        Node<T> n = new Node<T>(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=tail.next;
        }
        size++;
	}

	public int size() 
    {
        return size;
	}

	public boolean isEmpty() 
    {
        return size()==0;
	}

	public T dequeue() throws QueueEmptyException 
    {
        if(isEmpty())
        {
            QueueEmptyException e=new QueueEmptyException();
            throw e;
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
	}

	public T front() throws QueueEmptyException 
    {
        if(isEmpty())
        {
            QueueEmptyException e=new QueueEmptyException();
            throw e;
        }
        return head.data;
	}
}