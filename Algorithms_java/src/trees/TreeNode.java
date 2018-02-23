package trees;

import java.util.LinkedList;
import java.util.Queue;

import queues.QueueList;

public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		
		public TreeNode(int val){
			this.val = val;
			this.right = null;
			this.left = null;
		}
	
	
	public static void preOrderTraversal(TreeNode root){
		if(root==null)
			return;
		else{
			System.out.print(root.val + " ");
			if(root.left !=null)
				preOrderTraversal(root.left);
			if(root.right !=null)
				preOrderTraversal(root.right);
		}
	}
	
	public static void postOrderTraversal(TreeNode root){
		if(root==null)
			return;
		else{
			if(root.left !=null)
				postOrderTraversal(root.left);
			if(root.right !=null)
				postOrderTraversal(root.right);
			System.out.print(root.val + " ");
		}
	}
	
	public static void InOrderTraversal(TreeNode root){
		if(root==null)
			return;
		else{
			if(root.left !=null)
				InOrderTraversal(root.left);
			System.out.print(root.val + " ");
			if(root.right !=null)
				InOrderTraversal(root.right);
			
		}
	}
	
	public static void BFSTraversal(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode node= q.poll();
			System.out.print(node.val + "");
			if(node.left!=null)
				q.offer(node.left);
			if(node.right!=null)
				q.offer(node.right);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		
		preOrderTraversal(tree);
		//InOrderTraversal(tree);
		BFSTraversal(tree);
	}

}
