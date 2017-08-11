
public class DepthBinaryTree {

	public static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	public static int getDepth(TreeNode root){
		if(root==null)
			return 0;
		else
			return Math.max(getDepth(root.left), getDepth(root.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
