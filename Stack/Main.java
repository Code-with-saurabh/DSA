// import java.util.Stack;

class  Stack{
	private int[] stack;
	private int capacity;
	private int top;
	
	public Stack(int size){
		// we can also do size+1
		stack = new int[size];
		capacity=size;
		top=-1;
	}
	
	public void push(int element){
		if(top == capacity-1){
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = element;
	}
	public int pop(){
		if(top ==-1){
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}
	public int peek(){
		if(top ==-1){
			System.out.println("Stack is emapty");
			return -1;
		}
		return stack[top];
	}
	public boolean isEmpty(){
		return top==-1;
	}
	
}

public class Main{
    public static void main(String[] args){
        // System.out.println("Let's Go!!");
		 Stack stack = new Stack(5);
		 stack.push(10);
		 stack.push(20);
		 stack.push(30);
		 stack.push(40);
		 stack.push(50);
	 
		 System.out.println(stack.toString());
		 stack.pop();
		 stack.pop();
		 System.out.println(stack.peek());
		 System.out.println(stack.isEmpty());
		 
    }
} 