//1. construct BT using array
//2. count nodes of BT
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinaryTree {
	int index = -1;	

	TreeNode constructBT(int[] nodes) {
		index++;
		if(nodes[index] == -1)
			return null;
		TreeNode newNode = new TreeNode(nodes[index]);
		newNode.left = constructBT(nodes);
		newNode.right = constructBT(nodes);

		return newNode;
	}

	int countNodes(TreeNode root) {
		if(root == null)
			return 0;

		int leftCount = countNodes(root.left);
		int rightCount = countNodes(root.right);
	
		return leftCount + rightCount + 1;
	}

	void preOrder(TreeNode root) {
		if(root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	} 

	public static void main(String[] args) {
		TreeNode root = null;
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt = new BinaryTree();
		root = bt.constructBT(nodes);

		bt.preOrder(root);
		System.out.println();
		int count = bt.countNodes(root);

		System.out.println("Total count : " + count);
	}
}
