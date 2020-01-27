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
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		if(root == null)
            return null;
        if(root.left == null && root.right == null)
        {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(root.data);
            return ans;
        }
        ArrayList<Integer> left = longestRootToLeafPath(root.left);
        ArrayList<Integer> right = longestRootToLeafPath(root.right);
        if(left == null)
        {
            right.add(root.data);
            return right;
        }
        if(right == null)
        {
            left.add(root.data);
            return left;
        }
        if(left.size() > right.size())
        {
            left.add(root.data);
            return left;
        }
        else
        {
            right.add(root.data);
            return right;
        }
		
	}

	
	
}
