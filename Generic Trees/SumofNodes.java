public class Solution 
{
    public static int sumOfAllNode(TreeNode<Integer> root)
    {
        int sum=0;
        QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<TreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            TreeNode<Integer> temp=null;
            try{
                temp=q.dequeue();
            }
            catch(Exception e){
                
            }
            sum+=temp.data;
            for(int j=0;j<temp.children.size();j++)
            {
                q.enqueue(temp.children.get(j));
            }
        }
        return sum;
    }
}
