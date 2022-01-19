package binaryTree;

import java.util.Scanner;

public class Test {
	 static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) {
		  
		   BinaryImplementation a= new BinaryImplementation();
		   TreeNode root= a.createNode();
		   System.out.println("Inorder");
		   System.out.println(a.Inorder(root));
		   System.out.println("preOrder");
		   System.out.println(a.preOrder(root));
		   System.out.println("postOrder");
		   System.out.println(a.postOrder(root));
	       System.out.println( a.size(root));
           System.out.println(a.maxDepth(root));
				}
		}

