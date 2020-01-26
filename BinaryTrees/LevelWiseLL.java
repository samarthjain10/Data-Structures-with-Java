import java.util.ArrayList;
public class Solution 
{
    public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) 
    {
        ArrayList<Node<BinaryTreeNode<Integer>>> al=new ArrayList<Node<BinaryTreeNode<Integer>>>();
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            Node<BinaryTreeNode<Integer>> st=null;
            Node<BinaryTreeNode<Integer>> ptr=null;
            int a=q.size();
            for(int i=0;i<a;i++)
            {
                try
                {
                    root=q.dequeue();
                }
                catch(Exception e){}
                Node<BinaryTreeNode<Integer>> temp=new Node<BinaryTreeNode<Integer>>(root);
                if(st==null)
                {
                    st=temp;
                    ptr=st;
                }
                else
                {
                    ptr.next=temp;
                    ptr=ptr.next;
                }
                if(root.left!=null)
                {
                    q.enqueue(root.left);
                }
                if(root.right!=null)
                {
                    q.enqueue(root.right);
                }
            }
            al.add(st);
        }
        return al;
    }
}