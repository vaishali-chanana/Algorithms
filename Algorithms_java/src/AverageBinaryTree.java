import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageBinaryTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static List<Double> avgCalculate(TreeNode root){
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(root);
		List<Double> ret = new ArrayList<Double>();
		while(!que.isEmpty()){
			int sumLevel = 0;
			int count = 0;
			Queue<TreeNode> temp = new LinkedList<TreeNode>();
			while(!que.isEmpty()){
				TreeNode node = que.remove();
				sumLevel += node.val;
				count++;
				if(node.left!=null)
					temp.add(node.left);
				if(node.right!=null)
					temp.add(node.right);
			}
			que = temp;
			ret.add(sumLevel*1.0/count);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(9);
		tree.right = new TreeNode(20);
		tree.right.left = new TreeNode(15);
		tree.right.right = new TreeNode(7);
		
		System.out.println(avgCalculate(tree).toString());
		
	}

}
