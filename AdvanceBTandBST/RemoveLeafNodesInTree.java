import java.util.*;
public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root == null || root.children.size() == 0)
        {
            return null;
        }
        ArrayList<Integer> path = new ArrayList<Integer>();
        for(int i = 0; i < root.children.size(); i++)
        {
            TreeNode<Integer> child = root.children.get(i);
            if(child.children.size() == 0)
            {
                path.add(i);
            }
        }
        for(int i = path.size()-1; i>=0; i--)
        {
            int j = path.get(i);
            root.children.remove(j);
        }
        for(int i = 0; i < root.children.size(); i ++)
        {
            TreeNode<Integer> child = removeLeafNodes(root.children.get(i));
            if(child == null)
            {
                root.children.remove(i);
            }
        }
		return root;
	}
}
