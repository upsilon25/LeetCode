package queue;

import java.util.Queue;

public interface QueueInterface {
      final static int len=3;
      
      public void add(int num);
      public int remove();
      public int peek();
      public int size();
      public boolean isFull();
      public int[] show();
      
      
	 
}
