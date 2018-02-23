package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeTraversals {
	
	
	
	public static void verticalOrder(TreeNode root, int vert, TreeMap<Integer,List<Integer>>m){
		
		if(root == null)
			return;
		
		List<Integer>  existingList= m.get(vert);
		if(existingList == null)
			existingList = new ArrayList<Integer>();
		existingList.add(root.val);
		
		m.put(vert, existingList);
		
		if(root.left!=null)
			verticalOrder(root.left, vert-1, m);
		if(root.right!=null)
			verticalOrder(root.right, vert+1,m);
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				TreeNode tree = new TreeNode(1);
				tree.left = new TreeNode(2);
				tree.right = new TreeNode(3);
				tree.left.left = new TreeNode(4);
				tree.left.right = new TreeNode(5);
				tree.right.left = new TreeNode(6);
				tree.right.right = new TreeNode(7);
				
				//preOrderTraversal(tree);
				//InOrderTraversal(tree);
				TreeMap<Integer,List<Integer>> m = new TreeMap<Integer,List<Integer>>();
				verticalOrder(tree, 0, m);
				for(int i:m.keySet()){
					System.out.println("Vertical Order " + i + " " +m.get(i));
				}
				
	}

}
