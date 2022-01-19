package binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sun.source.tree.Tree;

public class BinaryImplementation {
        static Scanner sc= new Scanner(System.in);
        static List<Integer> a= new ArrayList<Integer>();
        static int count=0;
        public static TreeNode createNode() {
        	 TreeNode root=null;	
	    System.out.println("Enter number");  
	    int d=sc.nextInt();
	    count++;
	    if( d == -1) return null;
		root=new TreeNode(d);
		System.out.println("Enter left Node of"+root.data);
		root.left=createNode();
		System.out.println("Enter Right Node"+root.data);
		root.right=createNode();
		
		return root;
             }


      public static List<Integer> Inorder(TreeNode root) {
    	  List<Integer> l= new ArrayList<Integer>();
    	if(root==null) return l;
    	
    	l.addAll(Inorder(root.left));
        l.add(root.data);
        l.addAll(Inorder(root.right));
        return l;
    }
      
      
      public static List<Integer> preOrder(TreeNode root) {
    	  List<Integer> list= new ArrayList<Integer>();
      	if(root==null) return list;
      	list.add(root.data); 
      	list.addAll(Inorder(root.left));       
        list.addAll(Inorder(root.right));
        return list;
      }
      
      
      public static List<Integer> postOrder(TreeNode root) {
    	  List<Integer> list= new ArrayList<Integer>();
    	  if(root==null) return list;
    	  
          list.addAll(Inorder(root.left));
          
          list.addAll(Inorder(root.right));
          list.add(root.data); 
          return list;
        }
      public int size(TreeNode root) {
    	  return count;
      } 
      
      public int maxDepth(TreeNode root) {   
    	  if(root==null)
    		  return 0;
    	  return 1+Math.max(maxDepth(root.right), maxDepth(root.left));
      }

}
