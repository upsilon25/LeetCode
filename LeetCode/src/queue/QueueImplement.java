package queue;

import java.util.Arrays;

public class QueueImplement implements QueueInterface {
    int[] arr= new int[len];
	int rear=0;
	@Override
    public void add(int num) {
    		if(!isFull()) {
    			arr[rear++]=num;
    		}
    		else {
    			int[] temp = new int[arr.length+len];
    			for (int i = 0; i < arr.length; i++) {
				     temp[i]=arr[i];
				}
    			 temp[rear++]=num;
    			 arr=temp;
    		}
    }
	
	
   
   @Override
    public boolean isFull() {
	boolean result =(arr.length==rear+1)?true:false;
	return result;
}
   @Override 
    public String toString() {
 	return Arrays.toString(show());
}


   @Override
public int remove() {
	int rem=arr[rear-1];
	   if(rear==0)
		   return -1;
	   else {
	int temp[]= new int[rear-1];

	for (int i = 0; i < temp.length; i++) {
		temp[i]=arr[i+1];
	}
	--rear;}
	return rem;
}


@Override
public int peek() {
	
	return arr[rear-1];
}
@Override
public int[] show() {
	int[] temp= new int[rear];
	for (int i = 0; i < temp.length; i++) {
		temp[i]=arr[i];
	}
	return temp;
}

@Override
public int size() {
	
	return rear;
}
}
