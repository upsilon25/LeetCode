package LinkedList;

public class Test {
   
   
	public static void main(String[] args) {
		 Linked a= new Linked();
		 a.endInsert(12);
		 System.out.println(a);
		 a.endInsert(13);
		 System.out.println(a);
		 a.startInsert(10);
		 System.out.println(a);
		 System.out.println(a.startdel());
		 System.out.println(a);
		 System.out.println(a.endDel());
		 System.out.println(a);
 	 }

}
