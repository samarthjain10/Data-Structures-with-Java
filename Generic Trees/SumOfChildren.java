public class Solution 
{
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {
        if(root==null)
            return null;
        TreeNode<Integer> node=null;
        int sum=0,summ=0;
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
                summ+=temp.data;
                for(int j=0;j<temp.children.size();j++)
                {
                    q.enqueue(temp.children.get(j));
                    summ+=temp.children.get(j).data;
                }
                if(summ>sum)
                {
                    node=temp;
                    sum=summ;
                }
                summ=0;
            }
        }
        return node;
    }		
}