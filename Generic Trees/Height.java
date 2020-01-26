public class Solution 
{
    public static int height(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int count=0;
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
                for(int j=0;j<temp.children.size();j++)
                {
                    q.enqueue(temp.children.get(j));
                }
            }
            count++;
        }
        return count;
    }
}