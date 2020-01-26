public class Solution 
{
    public static void printLevelWise(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<TreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            TreeNode<Integer> temp=null;
            for(int i=0;i<a;i++)
            {
                try{
                    temp=q.dequeue();
                }
                catch(Exception e){

                }
                System.out.print(temp.data+" ");
                for(int j=0;j<temp.children.size();j++)
                {
                    q.enqueue(temp.children.get(j));
                }
            }
            System.out.println();
        }
    }
}