package LinkedList;

import java.util.Scanner;

public class Test {
   
   
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		 Linked a= new Linked();
		 boolean choice=true;
		 while(choice) {
		 System.out.println("Enter Choice\n1. StartInsert\n2. EndInsert\n3. StartDel\n4. EndDel\n5. Add AnyWhere (pos, a, element)\n6. Del AnyWhere  (pos, a, element)\n7. Count\n8. Find\n9. escape");	 
	     switch(sc.nextInt()) {
	     case 1:a.startInsert(sc.nextInt());
	            System.out.println(a);
	               break;
	     case 2:a.endInsert(sc.nextInt());
	            System.out.println(a);
          		   break;
	     case 3:a.startdel();
	      		System.out.println(a);		
	      		break;
	     case 4:a.endDel();
	      		System.out.println(a);		
	      		break;
	     case 5:a.insertAny(sc.nextInt(),a,sc.nextInt());
	      		System.out.println(a);
	            break;
	     case 6:a.delAny(sc.nextInt(), a);
	      		System.out.println(a);
	            break;
	     case 7:
	      	   System.out.println(a.count()); 
	            break;
	     case 8:
	           System.out.println(a.find(sc.nextInt()));  
	            break;
	     default:choice=false;
	     }
	 
		 }
		
     
	}
}
