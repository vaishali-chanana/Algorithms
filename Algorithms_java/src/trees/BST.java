package trees;

public class BST extends TreeNode{
	
	

	public BST(int val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
	
	public BST search(BST root, int key){
		if(root == null)
			return null;
		if(root.val==key)
			return root;
		if(key < root.val)
			return search((BST) root.left, key);
		else return search((BST) root.right, key);
		
	}
	
	public static BST insert(BST root, int key){
		if(root == null){
			root = new BST(key);
			return root;
		}
		if(key < root.val)
			root.left = insert((BST) root.left, key);
		else root.right = insert((BST) root.right, key);
		
		return root;
	}
	
	public static BST delete(BST root, int key){
		if(root == null)
			return null;
		if(root.val > key)
			root.left =  delete((BST)root.left, key);
		else if(root.val < key)
			root.right =  delete((BST)root.right, key);
		else{
			if(root.left == null )
				return (BST)root.right;
			else if(root.right == null)
				return (BST) root.left;
			
			root.val = minValue((BST)root.right);
			
			root.right = delete((BST)root.right, root.val);
		}
		
		return root;
	}
	
	
	public static int minValue(BST node){
		int minV = node.val;
		while(node.left!=null){
			
			minV = node.left.val;
			node = (BST) node.left;
		}
return minV;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST(50);
        insert(tree,30);
        insert(tree,20);
        insert(tree,40);
        insert(tree,70);
        insert(tree,60);
        insert(tree,80);
        
        InOrderTraversal(tree);
        System.out.println("--------------");
        preOrderTraversal(tree);
        System.out.println("--------------");
        delete(tree,40);
        
        InOrderTraversal(tree);
        

	}

}
