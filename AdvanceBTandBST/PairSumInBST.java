import java.util.*;
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


	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here

	ArrayList<Integer> al=new ArrayList<Integer>();
        helper(root,al);
        for(int i=0;i<al.size();i++)
        {
            for(int j=i+1;j<al.size();j++)
            {
                if(al.get(i)+al.get(j)==sum)
                {
                    if(al.get(i)<al.get(j))
                        System.out.println(al.get(i)+" "+al.get(j));
                    else
                        System.out.println(al.get(j)+" "+al.get(i));
                }
            }
        }
    }
    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> al)
    {
        if(root==null)
            return;
        else
            al.add(root.data);
        helper(root.left,al);
        helper(root.right,al);
    }
}