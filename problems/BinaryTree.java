/**
 * BiaryTree
 */ 
import java.util.*;
public class BinaryTree {

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

static class Info{
        int hd;
        Node node;

        Info(Node root, int hd){
            node = root;
            this.hd = hd;
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
// normal print
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
   // print level vise

    public void printLevels(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);continue;
                }

            }
            System.out.print(currNode.data+" ");
            if(currNode.left != null)q.add(currNode.left);
            if(currNode.right != null)q.add(currNode.right);

        }
        }
 public int countNodes(Node root){
            if(root == null){
                return 0;
            }
            return countNodes(root.left)+countNodes(root.right) + 1;
        }
    
  // calculate the height of the tree in terms of the nodes 
        public int height(Node root){
            if(root == null){
                return 0;
            }
            return Math.max(height(root.left),height(root.right)) + 1;
        }

        // count the nodes in the tree
      

      // calculate the diameter in the tree
      public int diameter(Node root){
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int rootDiamter = leftHeight + rightHeight + 1;
        return Math.max(Math.max(leftHeight,rightHeight),rootDiamter);
      }
      // print the top view of the tree

      
      public void topView(Node root){
        if(root == null){
            return;
        }
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root,0));
        q.add(null);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            Info curr = q.poll();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            if(!map.containsKey(curr.hd)){
            System.out.println(curr.node.data );
                map.put(curr.hd,curr.node);

            }
            if(curr.node.left !=null){
                q.add(new Info(curr.node.left,curr.hd - 1));
                min = Math.min(curr.hd - 1,min);
            }
            if(curr.node.right !=null){
                q.add(new Info(curr.node.right,curr.hd + 1));
                max = Math.max(curr.hd + 1,max);
            }

            // now check in hashmap if currnt hd exists in the map
            

            }
                        System.out.println(curr.node.data );

            if(!map.containsKey(curr.hd)){
            System.out.println(curr.node.data );
                map.put(curr.hd,curr.node);

            }

        }

        
        
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

    
    public static void main(String[] args) {
        InnerBiaryTree bt = new InnerBiaryTree();
        int [] nodes = {1,2,4,8,9,-1,-1,-1,-1,5,7,8,9,10,-1,-1,-1,-1,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root = bt.makeTree(nodes);
        // bt.printTree(root);
        // bt.printLevels(root);
        // System.out.println("The height of the roo is "+bt.height(root));
        // System.out.println("the number of Nodes"+bt.countNodes(root));
        // System.out.println("the diameter of Tree"+bt.diameter(root));

        System.out.println("the top view of Tree");
        bt.topView(root);
        // System.err.println("the preorder is ");
        // preorderTraversal(root);
        // System.err.println("postorder");
        // postTraversal(root);
        // System.err.println("inorder");

        // inorderTraversal(root);
    }
}