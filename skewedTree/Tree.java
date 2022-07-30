package skewedTree;

class Node {
 
	int val;
	Node left, right;
 
	Node(int item) {
		val = item;
		left = right = null;
	}
}

class Tree {
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void flatBTToSkewed(Node root, int order) {
    
		if(root == null) {
         return;
     }
    
     if(order > 0) {
         flatBTToSkewed(root.right, order);
     }
     
     else {
         flatBTToSkewed(root.left, order);
     }
     
     Node rightNode = root.right;
     Node leftNode = root.left;
    
     if(headNode == null) {
         headNode = root;
         root.left = null;
         prevNode = root;
     }
     
     else {
         prevNode.right = root;
         root.left = null;
         prevNode = root;
     }

     if (order > 0) {
         flatBTToSkewed(leftNode, order);
     }
     
     else {
         flatBTToSkewed(rightNode, order);
     }
 }

	static void rightSkewed(Node root) {
    
		if(root == null) {
			return;
     }
     
		System.out.print(root.val + " ");
		rightSkewed(root.right);       
 }

 
	public static void main (String[] args) {
		Tree.node = new Node(50);
		Tree.node.left = new Node(30);
		Tree.node.right = new Node(60);
		Tree.node.left.left = new Node(10);
		Tree.node.right.left = new Node(55);
    
		int order = 0;
		flatBTToSkewed(node, order);
		rightSkewed(headNode);

	}

}
