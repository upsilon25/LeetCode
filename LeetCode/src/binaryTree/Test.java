package binaryTree;

import java.util.Scanner;

public class Test {
	 static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) {
			
		   BinaryImplementation a= new BinaryImplementation();
		   Node root= a.createNode();
		   System.out.println("Inorder");
		   a.Inorder(root);
		   System.out.println("preOrder");
		   a.preOrder(root);
		   System.out.println("postOrder");
		   a.postOrder(root);

				}
		}

