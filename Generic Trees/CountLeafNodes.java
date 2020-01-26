public class Solution{
/*	TreeNode structure 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static int countLeafNodes(TreeNode<Integer> root){
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
            if(temp.children.size()==0)
                count++;
            for(int j=0;j<temp.children.size();j++)
            {
                q.enqueue(temp.children.get(j));
            }
        }
        return count;
	}	
}