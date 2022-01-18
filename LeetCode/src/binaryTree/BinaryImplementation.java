package binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinaryImplementation {
        static Scanner sc= new Scanner(System.in);
        static List<Integer> a= new ArrayList<Integer>();
       
        public static Node createNode() {
	    Node root=null;
	    System.out.println("Enter number");  
	    int d=sc.nextInt();
	    if( d == -1) return null;
		root=new Node(d);
		System.out.println("Enter left Node of"+root.data);
		root.left=createNode();
		System.out.println("Enter Right Node"+root.data);
		root.right=createNode();
		
		return root;
             }


      public static void Inorder(Node root) {
    	if(root==null) return ;
    	Inorder(root.left);
    	a.add(root.data);
      System.out.println(Arrays.toString(a.stream().toArray()));
        Inorder(root.right);
    }
      public static void preOrder(Node root) {
      	if(root==null) return;
      	 System.out.println(root.data);
      	  preOrder(root.left);
         
          preOrder(root.right);
      }
      
      
      public static void postOrder(Node root) {
        	if(root==null) return;
        	  postOrder(root.left);
            
             postOrder(root.right);
             System.out.println(root.data);
        }


}
