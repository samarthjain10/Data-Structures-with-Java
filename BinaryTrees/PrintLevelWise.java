public class Solution 
{
    public static void printLevelWise(BinaryTreeNode<Integer> roott)
    {
        BinaryTreeNode<Integer> root=null;
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
        q.enqueue(roott);
        while(!q.isEmpty())
        {
            try
            {
                root=q.front();
                System.out.print(root.data+":L:");
                if(root.left==null)
                {
                    System.out.print("-1,R:");
                }
                else
                {
                    System.out.print(root.left.data+",R:");
                    q.enqueue(root.left);
                }
                if(root.right==null)
                {
                    System.out.println("-1");
                }
                else
                {
                    System.out.println(root.right.data);
                    q.enqueue(root.right);
                }
                q.dequeue();
            }
            catch(Exception e)
            {
                
            }
        }
    }	
}





