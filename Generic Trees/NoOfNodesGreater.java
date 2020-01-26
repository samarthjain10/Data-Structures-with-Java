public class Solution 
{
    public static int numNodeGreater(TreeNode<Integer> root,int x)
    {	
        int count=0;
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
            if(temp.data>x)
                count++;
            for(int j=0;j<temp.children.size();j++)
            {
                q.enqueue(temp.children.get(j));
            }
        }
        return count;
    }
}