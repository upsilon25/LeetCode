package binaryTree;

import java.util.Scanner;

public class BinaryImplementation {
        static Scanner sc= new Scanner(System.in);
        
        
        public static Node createNode() {
	    Node root=null;
	    System.out.println("Enter number");  
	    int d=sc.nextInt();
	    if( d == -1) return null;
		root=new Node(d);
		System.out.println("Enter left Node");
		root.left=createNode();
		System.out.println("Enter Right Node");
		root.right=createNode();
		
		return root;
             }


    public static void printNode(Node root) {
    	if(root==null) return;
    	printNode(root.left);
      System.out.println(root.data);
        printNode(root.right);
    }


}
