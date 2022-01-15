package stack;

import java.util.Arrays;

public class StackImplementaion implements StackInterface{
    static int[] arr=new int[lenght];
	int top=0;
    @Override
	public int pop() {
		if(isEmpty()) {
			System.out.println("Its Empty");
		}
		else {
			int ret=arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i-1]=arr[i];
			}
			top--;
			return ret;
		}
		return -1;
	}

	@Override
	public void push(int num) {
		if(isFull()) {
			int count=arr.length;
			int[] temp=new int[arr.length+lenght]; 
			for (int i = 0; i < arr.length; i++) {
				temp[i]=arr[i];
				
			}
			temp[count++]=num;
			arr=temp;
			top++;
		}
		else			
			arr[top++]=num;
		
		
	}
	
	public boolean isFull() {
		if(top==arr.length)
			return true;
		else 
			return false;
	}
	public boolean isEmpty() {
		if(top==0) return true;
		else return false;
		
	}
     @Override
    public String toString() {  
    	
    	return Arrays.toString(arr);
    }   
     @Override
    public int[] useArr() {
    	int temp[]=new int[top];
    	 for (int i = 0; i < top; i++) {
			temp[i]=arr[i];
		}
    	return temp;
    }
     @Override
    public void showArr() {
    	 int temp[]=new int[top];
    	 for (int i = 0; i < top; i++) {
			temp[i]=arr[i];
		}
    	 System.out.println(Arrays.toString(temp));
    	
    }
     @Override
    public int stackLength() {
    	
    	return top;
    }
}
