/**
 * BiaryTree
 */
public class BiaryTree {

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

    /**
     * InnerBiaryTree     */
  static public class InnerBiaryTree {
       Node root;
       int indxx = -1;
       public Node makeTree(int [] nodes){
        indxx++;
        if(indxx == nodes.length - 1 || nodes[indxx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[indxx]);
        newNode.left = makeTree(nodes);
        newNode.right = makeTree(nodes);

        return newNode;
       }

       public void printTree(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" : ");
        if(root.left != null){
            System.err.print("L-"+root.left.data+" ");
        }
        if(root.right != null){
            System.err.print("R-"+root.right.data+" ");
        }
        System.err.println();
        printTree(root.left);
        printTree(root.right);
       }
    }


    // preorder 
    static public void preorderTraversal(Node root){
        if(root == null){
            return;
        }
        System.err.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    static public void postTraversal(Node root){
        if(root == null){
            return;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        System.err.print(root.data+" ");

    }
    static public void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.err.print(root.data+" ");
        inorderTraversal(root.right);

    }

    //main
    public static void main(String[] args) {
        InnerBiaryTree bt = new InnerBiaryTree();
        int [] nodes = {1,2,-1,-1,3,-1,-1};
        Node root = bt.makeTree(nodes);
        bt.printTree(root);
        // System.err.println("the preorder is ");
        // preorderTraversal(root);
        // System.err.println("postorder");
        // postTraversal(root);
        // System.err.println("inorder");

        // inorderTraversal(root);
    }
}