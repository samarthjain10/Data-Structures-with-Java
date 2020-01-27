import java.util.*;
public class Solution {

	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int data, int k) {
		ArrayList<BinaryTreeNode<Integer>> path = nodeToRootPath2(root, data);

		for (int i = 0; i <= k && i < path.size(); i++) {
			if (i == 0) {
				printkdown(path.get(i), k);
			} else if (i < k) {
				BinaryTreeNode<Integer> prev = path.get(i - 1);
				BinaryTreeNode<Integer> curr = path.get(i);

				if (prev == curr.left) {
					printkdown(curr.right, k - i - 1);
				} else {
					printkdown(curr.left, k - i - 1);
				}
			} else {
				BinaryTreeNode<Integer> curr = path.get(i);
				System.out.println(curr.data);
			}
		}
		
	}
    
    private static ArrayList<BinaryTreeNode<Integer>> nodeToRootPath2
        (BinaryTreeNode<Integer> node, int data) {
		if (node == null) {
			return new ArrayList<>();
		}

		if (node.data == data) {
			ArrayList<BinaryTreeNode<Integer>> path = new ArrayList<>();
			path.add(node);
			return path;
		}

		ArrayList<BinaryTreeNode<Integer>> lcpath = nodeToRootPath2(node.left, data);
		if (lcpath.size() > 0) { // mil gya left side pe
			lcpath.add(node);
			return lcpath;
		}

		ArrayList<BinaryTreeNode<Integer>> rcpath = nodeToRootPath2(node.right, data);
		if (rcpath.size() > 0) {
			rcpath.add(node);
			return rcpath;
		}

		return new ArrayList<>();
	}

	private static void printkdown(BinaryTreeNode<Integer> node, int k) {
		if (node == null) {
			return;
		}

		if (k == 0) {
			System.out.println(node.data);
			return;
		}

		printkdown(node.left, k - 1);
		printkdown(node.right, k - 1);
	}

}