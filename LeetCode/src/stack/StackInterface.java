package stack;

public interface StackInterface {
   public static final int lenght=3;
   
   public int pop() ;
   public void push(int num) ;
   public boolean isFull();
   public boolean isEmpty();
   public int[] useArr();
   public void showArr();
   public int stackLength();
   
}
