package binaryTree;

import java.util.Scanner;

public class Test {
	 static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) {
		  
		   BinaryImplementation a= new BinaryImplementation();
		   BinaryImplementation b= new BinaryImplementation();

		   TreeNode root1= a.createNode();
		   System.out.println("Inorder");
		   System.out.println(a.Inorder(root1));
		   System.out.println("preOrder");
		   System.out.println(a.preOrder(root1));
		   System.out.println("postOrder");
		   System.out.println(a.postOrder(root1));
	       System.out.println( a.size(root1));
           System.out.println(a.maxDepth(root1));
           TreeNode root2= b.createNode();
           System.out.println("Inorder");
		   System.out.println(a.Inorder(root2));
		   System.out.println(a.match(root1, root2));
		}
		}

