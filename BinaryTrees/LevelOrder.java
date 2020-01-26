import java.util.ArrayList;


public class Solution {

    /*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

    public static void printLevelWise(BinaryTreeNode<Integer> root){

        // Write your code here
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            for(int i=0;i<a;i++){
                try{
                    root=q.dequeue();
                }
                catch(Exception e){}
                System.out.print(root.data+" ");
                if(root.left!=null)
                {
                    q.enqueue(root.left);
                }
                if(root.right!=null)
                {
                    q.enqueue(root.right);
                }
            }
            System.out.println();
        }
    }
}



