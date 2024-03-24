import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

class BinarySearchTree{
	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}

	static class UseBST{
		Node rootOfTree = null;

		
		// take input for the tree
		public Node takeinput1Helper(Node root,int data){
			if(root == null){
				root = new Node(data);
				return root;
			}
			if(data > root.data){
				root.right = takeinput1Helper(root.right,data);
			}
			if(data <= root.data){
				root.left = takeinput1Helper(root.left,data);
			}
			return root;
		}
		public void takeInput(){
			System.out.println("Enter data");
			Scanner sc = new Scanner(System.in);
			 int data = sc.nextInt();
			 while(data != -1){
			 	rootOfTree = takeinput1Helper(rootOfTree,data);
			 	System.out.println("Enter the data to insert");
				data = sc.nextInt();
			 }

		}
	//print tree
	public void printTree(){
		if(rootOfTree == null){
			return;
		}
		Queue<Node> qu = new LinkedList<>();
		qu.add(rootOfTree);
		while(!qu.isEmpty()){
			Node node = qu.remove();
			System.out.print(node.data+": ");
			if(node.left != null){
				System.out.print("L: "+node.left.data+" ");
				qu.add(node.left);

			}
			if(node.right != null){
				System.out.print("R: "+node.right.data);
				qu.add(node.right);

			}
			System.out.println();
		}
	}
	//print the sorted inorder of te tree
	public void inorder(){
		printInorder(rootOfTree);
	}
	public void printInorder(Node root){
		if(root == null){
			return;
		}
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}
	// search in the tree
	public void search(int data){
		if(rootOfTree == null){
			System.out.println("No tree found please make tree first");
			return;
		}
		searchHelper(rootOfTree,data);

	}
	//search helper
	public void searchHelper(Node root , int data){
		if(root == null){
			System.out.println("Not found please make other search");
			return;
		}
		if(root.data == data){
			System.out.println("Found at ");
			return;
		}
		if(data > root.data){
			searchHelper(root.right, data);
		}
		if(data < root.data){
			searchHelper(root.left,data);
		}
	}
	// delete Node in the tree
	public Node deleteNodeHelper(Node root , int data){
		if(root.data > data){
			root.left = deleteNodeHelper(root.left,data);
		}else if(root.data < data){
			root.right = deleteNodeHelper(root.right,data);
		}else{ // now the node is found
		//case 1 if node has no child
		if(root.left == null && root.right == null){
			return null;
		}
		// if root has left child
		if(root.right == null){
			return root.left;
		}//if root has only right child
		if(root.left == null){
			return root.right;
		}
		Node LeftSmallestNode = findInorderPredecessor(root.right);
		System.out.println("left data"+LeftSmallestNode.data);
		root.data = LeftSmallestNode.data;
		deleteNodeHelper(LeftSmallestNode,LeftSmallestNode.data);
		
		}
		return root;
	}
		//find the predecessor of the node left side smallest
		public Node findInorderPredecessor(Node root){
			if(root.left == null){
				return root;
			}
			return findInorderPredecessor(root.left);
		}
		
		
	
	public void deleteNode(int data){
		rootOfTree = deleteNodeHelper(rootOfTree,data);
	}
	// Print in range k1 t0 k2
	public void printInRange(int k1,int k2){
		printInRangeHelper(rootOfTree,k1,k2);
	}
	//helper for print in range
	public void printInRangeHelper(Node root,int k1,int k2){
		if(root == null){
			return;
		}
		if(root.data >= k1 && root.data <= k2){
			printInRangeHelper(root.left,k1,k2);
			System.out.print(root.data+" ");			
			printInRangeHelper(root.right,k1,k2);
		}
		if(root.data > k2){
			printInRangeHelper(root.left,k1,k2);

		}
		if(root.data < k1){
			printInRangeHelper(root.left,k1,k2);
		}
	}
	//Print Paths
	public void printPaths(){
		ArrayList<Node> list = new ArrayList<>();
		System.out.println("The paths are");
		printPathsHelper(rootOfTree,list);

	}
	public void printPathsHelper(Node root,ArrayList<Node> list){
		if(root == null){
			return;
		}

		list.add(root);// add the node the list
		// if there are no further nodes print the paths
		if(root.left == null && root.right == null){
		for(int i = 0 ; i < list.size() ; i++){
				System.out.print(list.get(i).data+" ");
			}
			System.out.println();
		}
		printPathsHelper(root.left,list);// go to the left
		printPathsHelper(root.right,list);// got to the right
		list.remove(root);// after tree is printed then remove the curr node from the list

	}

	//mirror the Bst 
	public void mirrorBST(){
		// mirrorBSTHelper(rootOfTree);//implement using the recursion
		Stack<Node> stack = new Stack<>();//implement using the stack
		stack.push(rootOfTree);
		while(!stack.isEmpty()){
			Node node = stack.pop();
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
			if(node.left != null){
				stack.push(node.left);
			}
			if(node.right != null){
				stack.push(node.right);
			}
		}
	}
	public void mirrorBSTHelper(Node root){
		if (root == null) {
        return;
    }

    // Swap the left and right children of the current node
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    // Recur on both left and right subtrees
    mirrorBSTHelper(root.left);
    mirrorBSTHelper(root.right);
	}

	// MAKE BINARY TREE FROM SORTED ARRAY
	public void bstFromSortedArray(int[] arr){
		rootOfTree = bstFromSortedArrayHelper(arr,0,arr.length -1);
	}
	public Node bstFromSortedArrayHelper(int arr[],int start,int end){
		int mid = (start + end )/2;
		if(start > end) return null;
		Node root = new Node(arr[mid]);
		root.left = bstFromSortedArrayHelper(arr,start,mid - 1);
		root.right = bstFromSortedArrayHelper(arr,mid+1,end);
		return root;
	}

	// CREATE THE BALANCE BIMARY TREE
	// 1) CREATE THE SORTED ARRAYLIST
	// 2) THEN CREATE THE NEW TREE BALANCED USING BINARY SEARCH APPROACH
	public void createBalanceBST(){
		ArrayList<Integer> list = new ArrayList<>();
		getSortedList(rootOfTree,list);
		rootOfTree = buildSortedTree(list,0,list.size() - 1);
	}
	// build the balanced tree from array list
	public Node buildSortedTree(ArrayList<Integer> list,int start,int end){
		if(start > end){
			return null;
		}
		int mid = (start + end) / 2;
		Node node = new Node(list.get(mid));
		node.left = buildSortedTree(list,start,mid - 1);
		node.right = buildSortedTree(list,mid + 1,end);
		return node;

	}
	public void getSortedList(Node root,ArrayList<Integer> list){
		if(root == null){
			return;
		}
		getSortedList(root.left,list);
		list.add(root.data);
		getSortedList(root.right,list);
	}
}
	public static void main(String[] args) {
		UseBST BST = new UseBST();
		BST.takeInput();
		// BST.printTree();
		// BST.inorder();
		// BST.search(20);
		// BST.deleteNode(20);
		// BST.printTree();
		// BST.printInRange(1,20);
		// BST.printPaths();
		// BST.mirrorBST();
		// int arr[] = {2,3,4,8,10,11,12};
		// BST.bstFromSortedArray(arr);
		BST.printTree();
		BST.createBalanceBST();
		BST.printTree();



	}
}