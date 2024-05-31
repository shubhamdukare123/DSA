import java.util.*;


class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinaryTree {

	Scanner sc = new Scanner(System.in);

	Node constructBT() {
		System.out.println("Enter data for node");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.println("Do you want to add node on left side of : " + newNode.data);
		char leftNode = sc.next().charAt(0);
		if(leftNode == 'y' || leftNode == 'Y') {
			newNode.left = constructBT();
		}
		System.out.println("Do you want to add node on right side of : " + newNode.data);
		char rightNode = sc.next().charAt(0);
		if(rightNode == 'y' || rightNode == 'Y') {
			newNode.right = constructBT();
		}
		return newNode;
	}

	void preOrder(Node root) {
		if(root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root) {
		if(root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void postOrder(Node root) {
		if(root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}



	public static void main(String[] args) {
		Node root = null;
		BinaryTree bt = new BinaryTree();

		root = bt.constructBT();
		System.out.print("PreOrder : ");
		bt.preOrder(root);
		System.out.println();
		System.out.print("InOrder : ");
		bt.inOrder(root);
		System.out.println();
		System.out.print("PostOrder : ");
		bt.postOrder(root);
		System.out.println();
	}
}
