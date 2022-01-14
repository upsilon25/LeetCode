package LinkedList;

public class Linked {
  static Node head;
  String s;
  
  @Override
	public String toString() {
 		return "Node "+head.toString();
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
			  n=n.next;
		  }
		  Node ret=n.next;
		  n.next=null;
		 return ret.data; 
	  }
  }
  public static int count() {
	  int count=1;
	  Node node;
	  if(head==null) return 0;
	  else {
	  node=head;
	  while(node.next!=null) {
		  node=node.next;
		  count++;
	  }}
	  return count;
  }
  
  
  public int find(int num) {
	  int count=0;
	  Node node;
	  if(head==null) return -1;
	  else {
	  node=head;
	  while(node.next!=null) {
		  if(node.data==num) {
			  return count;		  
			  }
		  node=node.next;
		  count++;
	  }}
	  
	 if(node.data==num) return count;
	 return -1;
	  
  }
  public void delAny(int pos,Linked a) {
	  
	  if(pos==0) {a.startdel();}
	  if(pos==a.count()-1) {a.endDel();}
	  else if(pos<0 || pos>a.count()) {
		  System.out.println("position Incorrect");
	  }
	  else {
		  int posotion=1;
		  Node node=head;
		  for (int i = 1; i < pos; i++) {
			node=node.next;
		  }
		  node.next=node.next.next;
		  
	  }
	  
  }
  public void insertAny(int pos,Linked a,int ele) {
	  Node node;
	  node=head;
	  if(pos==0) {a.startInsert(ele);}
	  else if(pos==a.count()) {a.endInsert(ele);}
	  else if(pos<0 || pos>a.count()) System.out.println("wrong input limit is "+a.count());
	  else{
	   Node t=new Node();
	  for(int i = 1; i < pos; i++) {
		node=node.next;
	  }
	  t.data=ele;
	  t.next=node.next;
	  node.next=t;
	  }
  }
}
