import java.util.Stack;

public class index{
    public static void main(String[] args){
        // System.out.println("Let's Go!!");
		Stack<String> stack = new Stack<String>();
		System.out.println(stack);
		// pushing the Elemenet into the stack
		stack.push("first");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		System.out.println(stack);
		//Stack Follows FILO(First In Last Out) 
		
		//pop remove the element at the top of the stack
		stack.pop();
		System.out.println(stack);
		
		String RemovedElement = stack.pop();
		//pop function of stack also return the poped element of the stack
		System.out.println("Elemenet Removed From the Stack is : "+RemovedElement);
		
		//peek function is return a top of the stack element
		String Top = stack.peek();
		System.out.println("Top of the stack is "+Top);
		
		//search methos use to know that spacific element is exsist in stack or not is represte thire indexs like top of the satck index is 1 top next index 2 ... and so on .. and if element is not in the stack it return -1
		System.out.println(stack.search("Second"));
		System.out.println(stack.search("Third"));
		
		//i learnd about functions which are 
		/*
		push();//push the element
		pop();//pop the element
		peek();//return top of the stack
		search();//chake the exsistenc of element*/
		
		
		
    }
} 