package LinkedList;

public class Linked {
  static Node head;
  String s;
  
  @Override
	public String toString() {
 		return " Node "+head.toString();
	}
  public void endInsert(int n) {
	  Node node=new Node();
	  node.data=n;
	  if(head==null) {
		  head=node;
	  }
	  else {
		 Node t= new Node();
		 t = head;
		 while(t.next!=null) {
			 t=t.next;
		 }
		 t.next=node;
	  }
  }
  
  public static void startInsert(int n) {
	 Node node= new Node();
	 node.data=n;
	 node.next=head;
	 head=node;
  }
  
  public static int startdel() {
	  Node n;
	  n=head;
	  head = head.next;
	  return n.data;
  }
  public int endDel() {
	  if(head==null)
	  return -1; 
	  else
	  {
		  Node n=head;
		  while(n.next.next!=null) {
			  
		  }
		  Node ret=n.next;
		  n.next=null;
		 return ret.data; 
	  }
  }
}
