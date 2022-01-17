package queue;

public class Test {

	public static void main(String[] args) {
		QueueImplement a= new QueueImplement();
		a.add(891);
		a.add(12);
		a.add(10);
		a.add(52);

		a.add(154);
		a.add(23);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
		
	}

}
