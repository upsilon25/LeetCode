package stack;

import java.util.Arrays;
import java.util.Scanner;

import LinkedList.Linked; 

public class Test {

	public static void main(String[] args) {
		StackImplementaion a= new StackImplementaion();
		Scanner sc= new Scanner(System.in); 
		 
		 boolean choice=true;
		 while(choice) {
		 System.out.println("Enter Choice\n1. Pop\n2. Push\n3. isFull\n4. isEmpty\n5. Use array\n6. Show array\n7. Length\n8. escape");	 
	     switch(sc.nextInt()) {
	     case 1:
	            System.out.println(a.pop());
	               break;
	     case 2:a.push(sc.nextInt());
	            System.out.println(a);
         		   break;
	     case 3:
	      		System.out.println(a.isFull());		
	      		break;
	     case 4:
	      		System.out.println(a.isEmpty());		
	      		break;
	     case 5:
	      		System.out.println(a.useArr());
	            break;
	     case 6:a.showArr();
	      		
	            break;
	     case 7:
	      	   System.out.println(a.stackLength()); 
	            break;
	       default:choice=false;
	     }
		 }
		
	}

}
