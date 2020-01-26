import java.util.ArrayList;
import java.util.*;
public class Solution 
{
	public static void printZigZag(BinaryTreeNode<Integer> root) 
    {
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> s=new Stack<BinaryTreeNode<Integer>>();
        int count=1;
        q.enqueue(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            for(int i=0;i<a;i++)
            {
                try{
                    root=q.dequeue();
                }
                catch(Exception e){}
                if(count%2==1)
                System.out.print(root.data+" ");
                else
                    s.push(root);
                if(root.left!=null)
                {
                    q.enqueue(root.left);
                }
                if(root.right!=null)
                {
                    q.enqueue(root.right);
                }
            }
            while(!s.isEmpty())
            {
                System.out.print(s.pop().data+" ");
            }
            System.out.println();
            count++;
        }
	}
}