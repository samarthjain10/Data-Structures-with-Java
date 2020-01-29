import java.util.ArrayList;

class PriorityQueueException extends Exception {}

public class PQ {

    private ArrayList<Integer> heap;

    public PQ() {
        heap = new ArrayList<Integer>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin() throws PriorityQueueException{
        if(isEmpty()){
            // Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element)
    {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while(childIndex > 0){
            if(heap.get(childIndex) < heap.get(parentIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }else{
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException
    {
        if(isEmpty())
            throw new PriorityQueueException();
        
        int remove=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex = 0;
        int leftchildIndex = (2*parentIndex)+1;
        int rightchildIndex = (2*parentIndex)+2;

        while(leftchildIndex<heap.size())
        {
            int p=heap.get(parentIndex);
            int l=heap.get(leftchildIndex);
            if(rightchildIndex>=heap.size())
            {
                if(p>l)
                {
                    heap.set(parentIndex,l);
                    heap.set(leftchildIndex,p);
                    return remove;
                }
                else
                    return remove;
            }
            int r=heap.get(rightchildIndex);
            if(p<l&&p<r)
                return remove;
            else if(p>l&&p>r)
            {
                if(l<=r)
                {
                    heap.set(parentIndex,l);
                    heap.set(leftchildIndex,p);
                    parentIndex =leftchildIndex;
                }
                else
                {
                    heap.set(parentIndex,r);
                    heap.set(rightchildIndex,p);
                    parentIndex =rightchildIndex;
                }
                leftchildIndex = (2*parentIndex)+1;
                rightchildIndex = (2*parentIndex)+2;
            }
            else if(p>l)
            {
                heap.set(parentIndex,l);
                heap.set(leftchildIndex,p);
                parentIndex =leftchildIndex;
                leftchildIndex = (2*parentIndex)+1;
                rightchildIndex = (2*parentIndex)+2;
            }
            else
            {
                heap.set(parentIndex,r);
                heap.set(rightchildIndex,p);
                parentIndex =rightchildIndex;
                leftchildIndex = (2*parentIndex)+1;
                rightchildIndex = (2*parentIndex)+2;
            }
        }
        return remove;
    }
}

