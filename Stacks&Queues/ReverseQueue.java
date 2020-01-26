/********** Given Queue Class **************
// You can directly use these functions

class Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front();

	public void enqueue(T element);

	public T dequeue();
}

**********************************/



public class Solution {

	public static void reverseQueue(Queue<Integer> q) {
        Queue<Integer> z = new Queue<Integer>();
        while(q.isEmpty()==false)
        {
            z.enqueue(q.dequeue());
        }
        reverse(q,z);
	}
    public static void reverse(Queue<Integer> q,Queue<Integer> z) {
        if(z.isEmpty()==true)
        {
            return ;
        }
        int a=z.dequeue();
        reverse(q,z);
        q.enqueue(a);
    }
}