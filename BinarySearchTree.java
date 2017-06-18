import java.util.Scanner;

public class BinarySearchTree {
 
    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;
 
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
 
    // This method mainly calls insertRec()
    void insert(int key) {
       root = insertRec(root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+"\t");
            inorderRec(root.right);
        }
    }
 
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        Scanner scan = new Scanner(System.in);

        int i=1,key;
        do
        {
        	System.out.println("Enter your choice");
        	
        	System.out.println("1.insert\n2.inorder\n3.exit");

        	i=scan.nextInt();

        	switch(i)
        	{
        		case 1:
        		key = scan.nextInt();
        		tree.insert(key);
        		break;

        		case 2:
        		tree.inorder();
        		System.out.println();
        		break;
        		case 3:
        		break;

        		default:
        		System.out.println("enter a valid number");
        	}


        }while(i!=3);
        
        
 
        
        tree.inorder();
    }
}