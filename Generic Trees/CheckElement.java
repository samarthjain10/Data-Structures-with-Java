public class Solution 
{
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x)
    {
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
            if(temp.data.equals(x))
                return true;
            for(int j=0;j<temp.children.size();j++)
            {
                q.enqueue(temp.children.get(j));
            }
        }
        return false;
	}	
}