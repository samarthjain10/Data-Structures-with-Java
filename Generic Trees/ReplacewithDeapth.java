public class Solution 
{
    public static void replaceWithDepthValue(TreeNode<Integer> root)
    {
        int count=0;
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
                temp.data=count;
                for(int j=0;j<temp.children.size();j++)
                {
                    q.enqueue(temp.children.get(j));
                }
            }
            count++;
        }
    }	
}