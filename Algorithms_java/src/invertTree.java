import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class invertTree {

	public static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	public static TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<TreeNode>();
        q.push(root);
        
        while(!q.isEmpty()){
        	TreeNode node = q.pop();
        	TreeNode temp = node.left;
        	node.left = node.right;
        	node.right = temp;
        	
        	if(node.left!=null)
        		q.push(node.left);
        	if(node.right!=null)
        		q.push(node.right);
        }
        
        return root;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(9);
		
		System.out.println(invertTree(node));
	}

}
