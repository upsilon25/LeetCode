package recursive;

public class MulNatural {

	public static void main(String[] args) {
		int n=mulN(4);
		System.out.println(n);

	}

	public static int mulN(int i) {
		if(i==0) return 1;
		return i*mulN(--i);
	}

}
